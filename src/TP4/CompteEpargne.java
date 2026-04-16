package TP4;

public class CompteEpargne extends Compte {
   private double tauxInternet;
   public CompteEpargne(String numero, String titulaire, double solde, double tauxInternet) {
	   super(numero, titulaire, solde);
	   this.tauxInternet = tauxInternet;
   }
   public void calculerInternet() {
	   solde += solde * tauxInternet;
   }
public void retirer(double montant) {
	if (solde >= montant) { 

		solde -= montant;
	} else {
		System.out.println("Retrait interdit ! solde insuffisant.");
	}
	}
}