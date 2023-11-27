package TP2_2;

public class AppliArticle {
    public static void main(String[] args){
        Article a1 = new Article();
        a1.setReference("haut");
        a1.setDesignation("tshirt");
        a1.setPrix_ht(30);
        Article a2 = new Article();
        a2.setReference("bas");
        a2.setDesignation("jeans");
        a2.setPrix_ht(50);
        Article a3 = new Article();
        a3.setReference("chaussure");
        a3.setDesignation("converse");
        a3.setPrix_ht(80);
        
        System.out.println("Voici votre article:");
        a1.AfficherArticle();
        System.out.println("Voici votre article:");
        a2.AfficherArticle();
        System.out.println("Voici votre article:");
        a3.AfficherArticle();
    }
}
