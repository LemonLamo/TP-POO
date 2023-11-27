public class Application_Media {
    public static void main(String[] args) {

        Media[] baseDeDonnee = new Media[6];
       
        baseDeDonnee[0] = new Livre("Harry Potter", "J. K. Rowling", 240);
         baseDeDonnee[1] = new Livre("Le trone de fer", "G .G Martin", 789);
        baseDeDonnee[2] = new Livre("alchimiste", "polo coelho", 200);
        baseDeDonnee[3] = new BandeDessinee("Tintin au Tibet", "Hergé", "hergé");
        baseDeDonnee[4] = new Manga("attack on titan", "hajime isayama ", 25,"studio mappa");
        baseDeDonnee[5] = new DictionnaireBilingue("English-French Dictionary", "English", "French", 2);

        System.out.println("Affichage de la base de données :");
        for (Media media : baseDeDonnee) {
            if (media != null) {
                media.afficher();
                System.out.println(); // Ajoute une ligne vide pour la clarté
            }
        }
    }
}

