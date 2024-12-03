package vue;

import controller.EtudiantController;
import dao.GenericDao;
import dao.EtudiantDaoImpl;
import modele.Etudiant;

import java.util.Scanner;

public class EtudiantVue {
    private EtudiantController etudiantController;
    private Scanner scanner;

    public EtudiantVue() {
        // Initialiser le DAO et le contrôleur
        GenericDao<Etudiant> etudiantDao = new EtudiantDaoImpl();
        this.etudiantController = new EtudiantController(etudiantDao);
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenu() {
        int choix;

        do {
            System.out.println("\n=== Gestion des Étudiants ===");
            System.out.println("1. Ajouter un Etudiant");
            System.out.println("2. Modifier un Etudiant");
            System.out.println("3. Supprimer un Etudiant");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    ajouterEtudiant();
                    break;
                case 2:
                    modifierEtudiant();
                    break;
                case 3:
                    supprimerEtudiant();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 4);
    }

    private void ajouterEtudiant() {
        System.out.println("\n=== Ajouter un Étudiant ===");
        System.out.print("Votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Votre prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Votre filière : ");
        String filiere = scanner.nextLine();
        System.out.print("Votre age : ");
        int age = scanner.nextInt();
        

        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setAge(age);
        etudiant.setFiliere(filiere);

        etudiantController.ajouterEtudiant(etudiant);
        System.out.println("Étudiant ajouté avec succès !");
    }

    private void modifierEtudiant() {
        System.out.println("\n=== Modifier un Étudiant ===");
        System.out.print("ID de l'étudiant : ");
        int matricule = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nouveau Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Nouveau Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Nouvelle filière : ");
        String filiere = scanner.nextLine();
        System.out.print("Nouveau âge : ");
        int age = scanner.nextInt();
        
        Etudiant etudiant = new Etudiant();
        etudiant.setMatricule(matricule);
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setAge(age);
        etudiant.setFiliere(filiere);

        etudiantController.modifierEtudiant(etudiant);
        System.out.println("Étudiant modifié avec succès !");
    }

    private void supprimerEtudiant() {
        System.out.println("\n=== Supprimer un Étudiant ===");
        System.out.print("ID de l'étudiant : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        etudiantController.supprimerEtudiant(id);
        System.out.println("Étudiant supprimé avec succès !");
    }
}
