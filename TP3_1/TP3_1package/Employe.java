package TP3_1package;

public class Employe extends Personne {
    private double salaire;

    // Constructeur
    public Employe(String nom, String prenom, int anneeNaissance, double salaire) {
        super(nom, prenom, anneeNaissance);
        this.salaire = salaire;
    }

    // Getters et Setters
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Redéfinition de la méthode afficher pour afficher le salaire
    @Override
    public void afficher() {
        super.afficher();  // Appel de la méthode afficher de la classe Personne
        System.out.println("Salaire : " + salaire);
    }
}
