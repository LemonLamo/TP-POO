public class DictionnaireBilingue extends Dictionnaire {
    private String langueDestination;

    public DictionnaireBilingue(String titre, String langueSource, String langueDestination, int nombreTomes) {
        super(titre, langueSource, nombreTomes);
        this.langueDestination = langueDestination;
    }

    public String getLangueDestination() {
        return langueDestination;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Langue destination : " + langueDestination);
    }
}

