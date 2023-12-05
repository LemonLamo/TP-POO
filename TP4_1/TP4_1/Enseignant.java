package TP4_1;
public class Enseignant extends Personnes {
    String specialité;
    static int nbEnseignants;

    public Enseignant(String nom, String prénom, String rue,String ville, String specialité) {
      super(nom,prénom,rue,ville);
      this.specialité = specialité;
      nbEnseignants++;
    }
    @Override
    public String toString() {
      return super.toString()+"\n specialité :"+specialité;
    }
    
    @Override
    public void decrirePersonne() {
      System.out.println("Je suis enseignant(e)");
    }
    public static int nbEnseignants() {
      return nbEnseignants;
    }  
}
