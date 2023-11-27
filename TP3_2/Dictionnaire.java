public class Dictionnaire extends Media {
    private String langue;
    private int nombreTomes;

    // Constructeur
    public Dictionnaire(String titre, String langue, int nombreTomes) {
        super(titre);
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    // Accesseurs pour les attributs spécifiques à Dictionnaire
    public String getLangue() {
        return langue;
    }

    public int getNombreTomes() {
        return nombreTomes;
    }

    // Redéfinition de la méthode afficher() pour Dictionnaire
    @Override
    public void afficher() {
        super.afficher();  // Appel de la méthode afficher() de la classe Media
        System.out.println("Langue : " + langue);
        System.out.println("Nombre de tomes : " + nombreTomes);
    }
}
