public class Livre extends Media {
    private String auteur;
    private int nombrePages;

    // Constructeur
    public Livre(String titre, String auteur, int nombrePages) {
        super(titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    // Accesseurs pour les attributs spécifiques à Livre
    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    // Redéfinition de la méthode afficher() pour Livre
    @Override
    public void afficher() {
        super.afficher();  // Appel de la méthode afficher() de la classe Media
        System.out.println("Auteur : " + auteur);
        System.out.println("Nombre de pages : " + nombrePages);
    }
}