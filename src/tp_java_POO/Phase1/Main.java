package tp_java_POO.Phase1;

import java.util.Scanner;

import tp_java_POO.Phase1.controls.*;

public class Main {

    public static void main(String[] args) {

        // Initialiser la base de données

        // Afficher le menu principal
        showPrincipalMenu();

        // Boucle de gestion du menu
        while (true) {
            // Demander à l'utilisateur de choisir une option
            int option = getIntInput("Veuillez sélectionner une option : ");

            // Traiter l'option choisie
            switch (option) {
                case 1:
                    DepartementController.showMenu();
                    break;
                case 2:
                    FillierController.showMenu();
                    break;
                case 3:
                    EnseignantController.showMenu();
                    break;
                case 4:
                    ModuleController.showMenu();
                    break;
                case 5:
                    EtudientController.showMenu();
                    break;
                case 0:
                    System.out.println("A bientôt !");
                    System.exit(0);
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0)
            message = msg[0];
        System.out.print(message);
        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        // Closing Scanner after the use
        //  scan.close();
        return num;
    }

    public static void showPrincipalMenu() {
        System.out.println("-------------------------[ Bienvenu ]---------------------------");

        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

        int option = getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                DepartementController.showMenu();
                break;
            case 2:
                FillierController.showMenu();
                break;
            case 3:
                EnseignantController.showMenu();
                break;
            case 4:
                ModuleController.showMenu();
                break;
            case 5:
                EtudientController.showMenu();
                break;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
        }
    }
        public static String getStringInput(String s) {
            Scanner scan = new Scanner(System.in);
            System.out.print(s);
            String input = scan.nextLine();
            // scan.close(); // Not strictly necessary here
            return input;
        }
    }
