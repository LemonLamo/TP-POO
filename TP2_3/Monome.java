package TP2_3;

/**
 * Monome
 */
public class Monome {
    public double coef;
    public int degre;
    public float x;

    public Monome(double coef, int degre){
        this.coef = coef;
        this.degre = degre;
    }
    public MononeNul(double coef){
        this.coef = 0;
    }
    //methode afficher monome
    void Afficher(){
        System.out.println(" "+this.coef+"x^"+this.degre);
    }
    //methode evaluer(float x) qui retourne la valeur du monome pour la valeur x
    public double Evaluer(float x){
        return (Math.pow((double)x,(int)this.degre))*this.coef;
    }
    //methode derivate() qui retourne la valeur mathematique de la derivé d'un monome
    public double Derivative(){
        if(this.degre==0) {
            return 0;
        } else {
            return new Monome(coef*degre, degre-1);
        }
    public Monome ProduitM(Monome M){
        return new Monome(coef*, degre)
    }
}

