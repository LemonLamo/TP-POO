package TP3_1admin;
import TP3_1package;

public class Administrateur extends Personne {
    private String type;

    // Constructeur
    public Administrateur(String nom, String prenom, int anneeNaissance, String type) {
        super(nom, prenom, anneeNaissance);
        this.type = type;
    }

    // Redéfinition de la méthode afficherPersonne
    @Override
    protected void afficherPersonne() {
        super.afficherPersonne();  // Appel de la méthode afficherPersonne de la classe Personne
        System.out.println("Type : " + type);
    }

    public static void main(String[] args) {
        Administrateur admin = new Administrateur("Koucem", "Lamia", 2004, "Administrateur");
        admin.afficherPersonne();
    }
}