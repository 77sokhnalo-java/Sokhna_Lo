package gestion;
import java.util.Scanner;

public class GestionEtudiant {
	static Etudiant[] etudiants = new Etudiant[50];
	static int nombreEtudiants = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choix;
		
        do {
            System.out.println("\n MENU");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Trier par âge croissant");
            System.out.println("3. Afficher les 5 plus âgés et les 5 moyens âgés");
            System.out.println("4. Supprimer l'étudiant moyen âgé");
            System.out.println("5. Afficher la meilleure et la plus faible note");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {
                case 1:
					ajouterEtudiant();
					break;
                case 2:
					trierParAge();
					break;
                case 3:
					afficherAges();
					break;
                case 4:
					supprimerMoyenAge();
					break;
                case 5:
					afficherNotes();
					break;
                case 0:
					System.out.println("Fin du programme.");
					break;
                default -> System.out.println("Choix invalide !");
            }
        } while (choix != 0);
    }

}




