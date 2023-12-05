package TP4_1;
public class Application_Personnes {
    public static void main(String[] args) {
       Personnes [] P = new Personnes[3];
       P[0]=new Secretaire("A","AA","rue Didouche", "Alger"); 
       P[1]=new Enseignant ("B","BB","rue Sidi M'Hamed", "Alger", "Génie civil"); 
       P[2]=new Etudiant ("C","CC","rue Mogador", "Alger");
         for(Personnes i: P){
           System.out.println(i);//sinon System.out.println(i.toString())
             i.decrirePersonne();
        }
    }
}


