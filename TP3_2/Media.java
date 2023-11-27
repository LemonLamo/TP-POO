public class Media {
    private final String titre;
    private static int numeroEnregistrement = 1;
    private final int numeroMedia;

    // Constructeur
    public Media(String titre) {
        this.titre = titre;
        this.numeroMedia = numeroEnregistrement;
        numeroEnregistrement++;
    }

    // Accesseur pour le titre
    public String getTitre() {
        return titre;
    }

    // Nouvelle méthode pour obtenir le numéro d'enregistrement
    public int getNumero() {
        return numeroMedia;
    }
    public void afficher() {
        System.out.println("Numéro d'enregistrement : " + getNumero());
        System.out.println("Titre : " + getTitre());
    }

    public boolean plusPetit(Media doc) {
        return this.numeroMedia < doc.numeroMedia;
    }
}

