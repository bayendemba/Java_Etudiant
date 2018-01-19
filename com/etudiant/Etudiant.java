package com.etudiant;

public class Etudiant {
    private String nom, prenom;
    private int age, identifiant;

    public Etudiant(int id, String nom, String prenom, int age) {
        identifiant = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void afficher() {
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Nom Etudiant: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("age: " + age);
    }
}
