package TP3_3;
public class ApplicationChaine {
    //application des classes phrase et chaine
    public static void main(String[] args) {
        Phrase ph  = new Phrase("Je suis à Alger myfriend ?", "Français");
        ph.afficher();
        System.out.println(ph.getType());
        ph.longueurMot();

    }

}
