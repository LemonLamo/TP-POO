package TP3_3;

public class Chaine {
    String chaine_de_caractere; // Changement de 'char' à 'String'

    // Constructeur
    public Chaine(String chaine_de_caractere) {
        this.chaine_de_caractere = chaine_de_caractere;
    }

    // Getter et setter de la variable chaine_de_caractere
    public void setChaineDeCaractere(String chaine_de_caractere) {
        this.chaine_de_caractere = chaine_de_caractere;
    }

    public String getChaineDeCaractere() {
        return this.chaine_de_caractere;
    }

    // Methode polymorphe afficher
    public void afficher() {
        System.out.println("La chaîne de caractère est : " + chaine_de_caractere);
    }
}
