package TP3_1package;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un tableau de 5 personnes
        Personne[] personnes = new Personne[5];

        // Utilisation de Scanner pour saisir les données des employés
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Saisir les informations pour l'employé " + (i + 1) + ":");
            System.out.print("Nom : ");
            String nom = scanner.next();
            System.out.print("Prénom : ");
            String prenom = scanner.next();
            System.out.print("Année de naissance : ");
            int anneeNaissance = scanner.nextInt();
            System.out.print("Salaire : ");
            double salaire = scanner.nextDouble();

            personnes[i] = new Employe(nom, prenom, anneeNaissance, salaire);
        }

        // Utilisation de Scanner pour saisir les données du directeur
        System.out.println("Saisir les informations pour le directeur :");
        System.out.print("Nom : ");
        String nomDir = scanner.next();
        System.out.print("Prénom : ");
        String prenomDir = scanner.next();
        System.out.print("Année de naissance : ");
        int anneeNaissanceDir = scanner.nextInt();
        System.out.print("Salaire : ");
        double salaireDir = scanner.nextDouble();
        System.out.print("Nom de la société : ");
        String nomSociete = scanner.next();

        personnes[4] = new Directeur(nomDir, prenomDir, anneeNaissanceDir, salaireDir, nomSociete);

        // Affichage des informations de chaque personne (sauf nom et prénom)
        System.out.println("Affichage des informations (sauf nom et prénom) :");
        for (Personne personne : personnes) {
            personne.afficher();
            System.out.println("------------------");
        }

        // Affichage du nom et du prénom uniquement si l'âge est strictement inférieur à 70 ans
        System.out.println("Affichage du nom et du prénom pour les personnes de moins de 70 ans :");
        for (Personne personne : personnes) {
            if (personne.getAnneeNaissance() > 1953) {  // Calcul de l'année actuelle - 70
                System.out.println("Nom : " + personne.getNom() + ", Prénom : " + personne.getPrenom());
                System.out.println("------------------");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}

