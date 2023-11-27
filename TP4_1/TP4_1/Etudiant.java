package TP4_1;
class Etudiant extends Personne {
    String diplomeEnCours;
    static int nbEtudiants;
    @Override 
    public void decrirePersonne() {
        System.out.println("Je suis un etudiant");
    }
    //Constructeur par défaut
    public Etudiant(String nom, String prenom, String rue, String ville){
        super(nom,prenom,rue,ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants++;
    }
    public static int nbEtudiants(){
        return nbEtudiants;
        }
    public String toString(){
            return super.toString()+"\nLa diplôme en cours : "+diplomeEnCours;
            }
            
}
