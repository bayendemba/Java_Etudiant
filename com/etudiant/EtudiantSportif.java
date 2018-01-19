package com.etudiant;

public class EtudiantSportif extends Etudiant {
    private String sportpratiquer;

    public EtudiantSportif(int id, String nom, String prenom, int age, String sport) {
        super(id, nom, prenom, age);
        this.sportpratiquer = sport;
    }

    public String getSportpratiquer() {
        return sportpratiquer;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Sport pratiquer: " + sportpratiquer);
    }
}
