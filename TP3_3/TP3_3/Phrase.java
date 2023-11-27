package TP3_3;

public class Phrase extends Chaine {
    String langue;

    // Constructeur
    public Phrase(String chaine_de_caractere, String langue) {
        super(chaine_de_caractere); // Correction ici
        this.langue = langue;
    }

    @Override
    public void afficher() {
        System.out.println("La phrase en " + this.langue + " est : " + this.getChaineDeCaractere()); // Modification ici
    }

    // Methode type qui permet de retourner le type de la phrase : declaratif , interrogatif , exclamatif
    public String getType() {
        if (this.getChaineDeCaractere().endsWith("?")) return "interrogatif";
        else if (this.getChaineDeCaractere().endsWith("!")) return "exclamatif";
        else return "declaratif";
    }

    // Methode longueurMot() pour retournant le mot le plus long de la phrase avec sa longueur, il est possible d'utiliser la methode split
    public void longueurMot() {
        String[] mots = this.getChaineDeCaractere().split(" "); // Split par espace pour obtenir les mots
        String motLong = "";
        int longueurMax = 0;

        for (String mot : mots) {
            if (mot.length() > longueurMax) {
                motLong = mot;
                longueurMax = mot.length();
            }
        }

        System.out.println("Le mot le plus long dans la phrase est : " + motLong + " avec une longueur de " + longueurMax + " caractères.");
    }
}
 
