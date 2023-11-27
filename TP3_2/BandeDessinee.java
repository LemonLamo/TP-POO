public class BandeDessinee extends Media {
    private String auteurBD;
    private String illustrateur;

    public BandeDessinee(String titre, String auteurBD, String illustrateur) {
        super(titre);
        this.auteurBD = auteurBD;
        this.illustrateur = illustrateur;
    }

    // Getters pour les attributs spécifiques à BandeDessinee
    public String getAuteurBD() {
        return auteurBD;
    }

    public String getIllustrateur() {
        return illustrateur;
    }

    // Redéfinition de la méthode afficher() pour BandeDessinee
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Auteur de la BD : " + auteurBD);
        System.out.println("Illustrateur : " + illustrateur);
    }
}
