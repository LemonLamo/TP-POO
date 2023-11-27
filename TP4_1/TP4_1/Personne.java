package TP4_1;
   public abstract class Personne {
    protected String nom, prenom,rue,ville;
    protected static int nbPersonnes;
  public Personne (String nom, String prenom,String rue, String ville){
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
System.out.println("Nombre de personnes : "+nbPersonnes);

}
public void modifierPersonne(String rue,String ville){
this.rue=rue;
this.ville=ville;
System.out.println(this);//System.out.println(toString());
}
}