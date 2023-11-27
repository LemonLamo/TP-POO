package TP2_2;

public class Article {
    private String reference;
    private String designation;
    private double prix_ht;
    public double taux_tva=19.6 ;//tva en france

    public Article() {
        reference = "anonyme";
        designation = "anonyme";
        prix_ht = 0.0;
    }
    public Article(String reference ,String designation,double prix_ht) {
        this.reference = reference;
        this.designation = designation;
        this.prix_ht = prix_ht;
    }
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference= reference;

    }
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation= designation;
    }
    public Double getPrix_ht () {
        return prix_ht;
    }
    public void setPrix_ht(double prix_ht){
        this.prix_ht= prix_ht;
    }
    //methode de calcul du prix ttc d'un article
    public double PrixTTC(){
        return (this.getPrix_ht())+(this.getPrix_ht()*this.taux_tva/100);
}
    
    public void AfficherArticle() {
        System.out.println("Référence : "+this.getReference());
        System.out.println("Désignation : "+this.getDesignation());
        System.out.println("Prix HT : "+this.getPrix_ht());
        System.out.println("TVA (fixe) : "+this.taux_tva+"%");
        // Il faut utiliser this.PrixTTC() au lieu de Article.PrixTTC()
        System.out.println("le prix total de l'article est : "+this.PrixTTC());
    }
}
