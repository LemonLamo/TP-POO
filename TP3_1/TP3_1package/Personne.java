package TP3_1package;
public class Personne {
    private String nom;
    private String prenom;
    private int anneeNaissance;

    // Constructeur
    public Personne(String nom, String prenom, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    // Méthode polymorphe pour afficher l'année de naissance
    public void afficher() {
        System.out.println("Année de naissance : " + anneeNaissance);
    }

    // Méthode polymorphe pour afficher le nom et le prénom
    protected void afficherPersonne() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom);
    }
}