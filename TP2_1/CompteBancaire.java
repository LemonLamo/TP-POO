package TP2_1;

public class CompteBancaire {
    
    private double solde;
    private String id;
    
    public CompteBancaire(double soldeInitial, String idInitial) {
        this.solde = soldeInitial;
        this.id = idInitial;
    }
    
    public CompteBancaire() {
        solde = 0;
        id = "anonyme";
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getSolde() {
        return solde;
    }
    
    public void setSolde(double solde) {
        this.solde = solde;
    }
     //void retirer pour debiter le compte d'un montant strictement positif si le solde du compte est au moins egal au montant (ne fait rien sinon)
     public void retirer (double montant) {
        if (montant <= solde){
            solde -= montant;
        } else{
            System.out.println("Le montant est supérieur au solde, you are poor");
        }
     }

    public void deposer (double montant) {
          if (montant >= 0) {
            solde += montant;
          }
    }
    public void transferer(double montant , CompteBancaire CompteDepot){
        if ((CompteDepot != null) && (this.getSolde() > montant)){
            this.retirer(montant);
            CompteDepot.deposer(montant);
        }
    }
    public void afficher() {
        System.out.println("ID du compte : " + this.id);
        System.out.println("Solde du compte : " + this.solde);
    }
}
