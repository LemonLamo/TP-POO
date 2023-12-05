package TP4_2;

public class Interface {
    public static void main(String[] args) {
        Modifiable tab[] = new Modifiable[4];
        tab[0]=new AA(2, "Premier AA");
        tab[1]=new AA(3, "Deuxième AA");
        tab[2]=new BB(4, "Premier BB");
        tab[3]=new BB(5, "Premier BB");
        for(Modifiable i : tab){
            System.out.println("Avant zoom :...");
            System.out.println(i);
            i.zoomer(2);
            System.out.println("Après zoom :...");
            System.out.println(i);
            }
    }
}
