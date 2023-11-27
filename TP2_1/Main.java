package TP2_1;

public class Main {
    public static void main (String[] args ) {
        CompteBancaire compte = new CompteBancaire();
        compte.setId("Mohamed Kamel");
        compte.deposer(100);
        compte.deposer(50);
        // Retirer 20 unités pour acheter des livres
        compte.retirer(20);
        // Calculer le solde actuel
        double solde = compte.getSolde();
        // Afficher l'etat du compte  à l'écran
        compte.afficher();
        
        CompteBancaire compteEpargne = new CompteBancaire();
        compteEpargne.setId("Lamia koucem");
        
        // Transférer 100 unités du compte au compte compteEpargne
        compte.transferer(100, compteEpargne);
        
        // Afficher l'etat du compteEpargne à l'écran
        compteEpargne.afficher();
        System.out.println("le solde du compte initial apres le transfer au compte epargne :"+compte.getSolde());
    }
}

