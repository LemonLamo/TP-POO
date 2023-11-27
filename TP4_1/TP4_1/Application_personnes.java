package TP4_1;
public class Application_Personne {
public static void main(String[] args) {
Personne [] P = new Personne[3];
P[0]=new Secretaire("A","AA","rue Didouche", "Alger", "A007"); 
P[1]=new Enseignant ("B","BB","rue Sidi M'Hamed", "Alger", "Génie civil"); 
P[2]=new Etudiant ("C","CC","rue Mogador", "Alger", "Informatique");
for(Personne i: P){
System.out.println(i);//sinon System.out.println(i.toString())
i.decrirePersonne();
}
}
}
