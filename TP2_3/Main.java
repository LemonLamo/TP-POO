 package TP2_3;

 class Main {
 public static void main(String[] args) {
        Monome monome = new Monome(3, 2); // Exemple de création d'un monome
        monome.Afficher(); // Affiche le monome

        double valeurX = 5;
        double resultat = monome.Evaluer(valeurX);
        System.out.println("Valeur du monome pour x=" + valeurX + " : " + resultat);

        Monome derivee = monome.Derivative();
        derivee.Afficher(); // Affiche la dérivée du monome
    }
}
}
