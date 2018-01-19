package com.etudiant;

public class GroupeTD {
    private Etudiant T[];
    private int n, N;

    public GroupeTD(int N) {
        T = new Etudiant[this.N = N];
        n = 0;
    }

    public boolean ajouter(Etudiant etudiant) {
        if (n <= N) {
            T[n++] = etudiant;
            return true;
        }
        return false;
    }

    public void afficherGroupe() {
        for (int i = 0; i < n; i++)
            T[i].afficher();
    }
}
