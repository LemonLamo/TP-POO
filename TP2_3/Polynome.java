package TP2_3;
public class Polynome {
        Monome M1, M2, M3;
        public Polynome (Monome M1, Monome M2 , Monome M3) {
            this.M1=M1;
            this.M2=M2;
            this.M3=M3;
        }
        public int Degre(){
            if (M1.coef !=0) {
                return M1.degre;
            } else if (M2.coef != 0) {
                return M2.degre;
            } else {
                return M3.degre;
            }
        }
        public double EvaluerPoly (float x) {
            return M1.Evaluer(x)+M2.Evaluer(x)+M3.Evaluer(x);
        }
        public void AfficherPoly () {
            
        }
}
