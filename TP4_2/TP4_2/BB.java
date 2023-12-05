package TP4_2;
public class BB extends B implements Modifiable{
String chaine;
BB(float numero, String chaine){
super(numero);
this.chaine=chaine;
}
public void zoomer(int n){
if (n>MAX)
n=MAX;
else if (n<MIN)
n=MIN;
else if (n==0)
n=1;
else if (n>0)
numero=numero*4;//ou numero=*4;
else
numero=numero/4;//ou numero/=4;

}
public String toString(){
    return super.toString()+"\nLa chaîne est : "+chaine+"\nAvec un minimum de : "+MIN+"\nEt un maximum de : "+MAX;
}
}