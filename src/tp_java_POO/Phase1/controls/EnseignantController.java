package tp_java_POO.Phase1.controls;

import tp_java_POO.Phase1.Main;
import tp_java_POO.Phase1.Services.BD;
import tp_java_POO.Phase1.models.Enseignant;
import java.util.List;

public class EnseignantController {
    public static void showMenu() {
        System.out.println("-------------------------[ Enseignants ]---------------------------");


        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher les enseignant");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");
        int operation = Main.getIntInput("Veuillez saisir une operation");
        //"Veuillez sélectionner une option : ")
        switch (operation) {
            case 1:
                AjouteEnseignant();
                break;
            case 2:
                AfficheEnseignant ();
                break;
            case 3:
                UpdateEnseignant ();
                break;
            case 4:
                DeleteEnseignant ();
                break;
            case 5:
                RestartMenu();
                break;
        }
    }
    public static void AfficheEnseignant() {
        List<Enseignant> enseignants = BD.enseignants; // Replace with actual retrieval logic
        if (enseignants.isEmpty()) {
            System.out.println("Aucun enseignant trouvé.");
        } else {
            System.out.println("Liste des enseignants:");
            for (Enseignant enseignant : enseignants) {
                System.out.println("- " + enseignant.toString()); // Assuming Enseignant has a toString() method
            }
        }
    }
        public static void AjouteEnseignant  () {

        }
        public static void UpdateEnseignant  () {

        }
        public static void DeleteEnseignant  () {

        }
        public static void RestartMenu(){

        }
    }


