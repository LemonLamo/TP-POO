public class Manga extends Livre {
    private String maisonEdition;

    public Manga(String titre, String auteur, int nombrePages, String maisonEdition) {
        super(titre, auteur, nombrePages);
        this.maisonEdition = maisonEdition;
    }

    // Getter pour l'attribut spécifique à Manga
    public String getMaisonEdition() {
        return maisonEdition;
    }

    // Redéfinition de la méthode afficher() pour Manga
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Maison d'édition : " + maisonEdition);
    }
}

