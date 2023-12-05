package TP4_1;
public abstract class Personnes {
    protected String nom, prenom,rue,ville;
    protected static int nbPersonnes;
  public Personnes (String nom, String prenom,String rue, String ville){
    this.nom=nom;
    this.prenom=prenom;
    this.rue=rue;
    this.ville=ville;
    nbPersonnes++;
}
public String toString(){
return "Le nom : "+nom+"\n"+"Le prénom : "+prenom+"\n"+"La rue : "+rue+"\n"+"La ville : "+ville;
}
   public abstract void decrirePersonne();
public static void nbPersonnes(){
  System.out.println("le Nombre de personnes est : "+nbPersonnes);
  System.out.println("le Nombre d'etudiants est  : "+Etudiant.nbEtudiants);
  System.out.println("le Nombre d'enseigants est  : "+Enseignant.nbEnseignants);
  System.out.println("le Nombre de secretaires est : "+Secretaire.nbSecretaires);

}
public void modifierPersonne(String rue,String ville){
this.rue=rue;
this.ville=ville;
System.out.println(this); // fais le travail du toString()
}
}