package TP3_1package;
public class Directeur extends Employe {
    private String societe;

    // Constructeur
    public Directeur(String nom, String prenom, int anneeNaissance, double salaire, String societe) {
        super(nom, prenom, anneeNaissance, salaire);
        this.societe = societe;
    }

    // Getters et Setters
    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    // Redéfinition de la méthode afficher pour afficher les informations de la société
    @Override
    public void afficher() {
        super.afficher();  // Appel de la méthode afficher de la classe Employe
        System.out.println("Société : " + societe);
    }
}