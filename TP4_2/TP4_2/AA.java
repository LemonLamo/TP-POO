package TP4_2;
public class AA extends A implements Modifiable {
    String nom;
    AA (float taille ,String nom ){
        super(taille);
        this.nom=nom;
    }

    void incrementer(){
        taille=taille+1;
    };
    @Override
    public String toString(){
        return super.toString()+"\n le nom est "+nom+"\n le minumum est : "+MIN+"\n le maximum est :"+MAX;
    };
    public void zoomer(int n){
        if (n>MAX)
        n=MAX;
        else if (n<MIN)
        n=MIN;
        else if (n==0)
        n=1;
        else if (n>0)
        taille=taille*2;
        else
        taille=taille/2;
        
        }
}