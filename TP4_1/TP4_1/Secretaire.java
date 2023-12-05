package TP4_1;
public class Secretaire extends Personnes {
      String numeroBureau;
      static int nbSecretaires;
    
    public Secretaire(String nom, String prenom, String rue, String ville) {
        super(nom, prenom, rue, ville);
        this.numeroBureau = numeroBureau;
        nbSecretaires++;
    }
@Override
    public void decrirePersonne() {
        System.out.println("je suis secretaire");
    }
    public String toString(){
        return super.toString()+"le nombre de bureau:"+numeroBureau;
    }
    public static int  nbSecretaires () {
        return nbSecretaires;
    }
}


