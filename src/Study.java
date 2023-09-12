
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.JOptionPane;

public class Study {

	public static void main(String[] args) {
		
	   DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols());
	   df.setRoundingMode(RoundingMode.HALF_EVEN);
	   
	   String importoFinanziamento = JOptionPane.showInputDialog("Inserisci l'importo del finanziamento ");
	   String durataAnni = JOptionPane.showInputDialog("Inserisci la durata in anni");
	   String numeroRateAnnuali = JOptionPane.showInputDialog("Inserisci il numero di rate annuali");
	   String TAN = JOptionPane.showInputDialog("Inserisci il tasso annuale");
	   
	   double impFinanziamento = Double.parseDouble(importoFinanziamento);
	   int durAnni = Integer.parseInt(durataAnni);
	   int numRateAnn = Integer.parseInt(numeroRateAnnuali);
	   double tassoAnnuale = Double.parseDouble(TAN);
	   
	   int numRateTot = durAnni*numRateAnn;
	   double quotaCapitale = impFinanziamento/numRateTot;
	  
	   
	   System.out.println("N.Rata - Importo Rata - Quota Interesse - Quota Capitale - Cap.Residuo\n");

	   for (int i = 1; i <= numRateTot;i++) {
		   
		   double quotaInteressi = (impFinanziamento*tassoAnnuale/numRateAnn)/100;
		   double importoRata = quotaCapitale + quotaInteressi;
		   impFinanziamento-=quotaCapitale;
		   System.out.println("Rata num." + i + " "+df.format(importoRata) + " € " +" "+ 
		   df.format(quotaInteressi) + " € "+ " " + df.format(quotaCapitale) + " € " + 
	       " " + df.format(impFinanziamento)+ " € ");
		   
		   
	   }
	   
	 
	   
	}

}