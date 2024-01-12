package tp_java_POO.Phase1.controls;

import tp_java_POO.Phase1.Main;
import tp_java_POO.Phase1.Services.BD;

import static tp_java_POO.Phase1.controls.EnseignantController.RestartMenu;

public class FillierController {
    public static void showMenu() {
        System.out.println("-------------------------[ Filier ]---------------------------");


        System.out.println("1: Pour ajouter un Filier");
        System.out.println("2: Pour afficher les Filiers");
        System.out.println("3: Pour modifier un Filier");
        System.out.println("4: Pour supprimer un Filier");
        System.out.println("0: Pour retourner au menu principal");
        int operation = Main.getIntInput("Veuillez saisir une operation");
        //"Veuillez sélectionner une option : ")
        switch (operation) {
            case 1:
                AjouterFilier();
                break;
            case 2:
                AfficheFilier();
                break;
            case 3:
                UpdateFilier();
                break;
            case 4:
                DeleteFilier();
                break;
            case 5:
                RestartMenu();
                break;
        }
    }

    private static void DeleteFilier() {
    }

    private static void UpdateFilier() {

    }

    private static void AfficheFilier() {

    }

    private static void AjouterFilier() {

    }

}
