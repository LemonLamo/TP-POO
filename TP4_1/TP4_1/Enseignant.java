package TP4_1;
public class Enseignant extends Personne {
    String specialité;
    static int nbEnseignants;
    @Override
    public void decrirePersonne() {
      System.out.println("Je suis un enseignant");
    }
    
}
