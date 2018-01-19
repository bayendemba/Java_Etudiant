package com.etudiant;

public class Main {

    public static void main(String[] args) {
	    GroupeTD groupeTD = new GroupeTD(5);

	    groupeTD.ajouter(new Etudiant(2,"Diop","Cheikh", 20));
	    groupeTD.ajouter(new EtudiantEtranger(12,"Fall","Mamadou",20,"Dakar"));
	    groupeTD.ajouter(new EtudiantSportif(72,"Gueye","Awa",28,"Football"));
	    groupeTD.ajouter(new EtudiantSportif(92,"Gueye","Awa",28,"Basket"));
	    groupeTD.ajouter(new EtudiantSportif(82,"Sarr","Abdou",28,"Basket"));
	    groupeTD.afficherGroupe();
	    System.out.println("****************END********************");
    }
}
