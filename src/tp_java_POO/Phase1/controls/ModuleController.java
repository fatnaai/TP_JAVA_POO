package tp_java_POO.Phase1.controls;

import tp_java_POO.Phase1.Main;
import tp_java_POO.Phase1.models.Enseignant;
import tp_java_POO.Phase1.models.Filiere;

import static tp_java_POO.Phase1.controls.EnseignantController.RestartMenu;

public class ModuleController {
    public static void showMenu() {
        System.out.println("-------------------------[ Module ]---------------------------");


        System.out.println("1: Pour ajouter un Module");
        System.out.println("2: Pour afficher un Module");
        System.out.println("3: Pour modifier un Module");
        System.out.println("4: Pour supprimer un Module");
        System.out.println("0: Pour retourner au Module");
        int operation = Main.getIntInput("Veuillez saisir une operation");
        //"Veuillez sélectionner une option : ")
        switch (operation) {
            case 1:
                AjouterModule();
                break;
            case 2:
                AfficheModule();
                break;
            case 3:
                UpdateModule();
                break;
            case 4:
                DeleteModule();
                break;
            case 5:
                RestartMenu();
                break;
        }
    }

    private static void DeleteModule() {
    }

    private static void UpdateModule() {

    }

    private static void AfficheModule() {

    }

    public static void AjouterModule () {



    }

}
