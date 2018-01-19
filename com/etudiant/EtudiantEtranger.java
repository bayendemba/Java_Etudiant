package com.etudiant;

public class EtudiantEtranger extends Etudiant {
    private String paysorigine;

    public EtudiantEtranger(int id, String nom, String prenom, int age, String paysorigine) {
        super(id, nom, prenom, age);
        this.paysorigine = paysorigine;
    }

    public String getPaysorigine() {
        return paysorigine;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Pays d'origine: " + paysorigine);
    }
}
