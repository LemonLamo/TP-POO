package TP3_1package;
public class Societe {
    private String nomSociete;
    private int nbEmploye;

    // Constructeur
    public Societe(String nomSociete, int nbEmploye) {
        this.nomSociete = nomSociete;
        this.nbEmploye = nbEmploye;
    }

    // Getters et Setters
    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }
}