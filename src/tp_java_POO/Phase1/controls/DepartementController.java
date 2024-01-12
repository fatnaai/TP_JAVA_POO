package tp_java_POO.Phase1.controls;

import tp_java_POO.Phase1.Main;
import tp_java_POO.Phase1.Services.BD;

import tp_java_POO.Phase1.models.Departement;
import tp_java_POO.Phase1.models.Enseignant;

public class DepartementController {
    public static void showMenu() {
        System.out.println("-------------------------[ Départements ]---------------------------");


        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");
        int operation = Main.getIntInput("Veuillez saisir une operation");
        //"Veuillez sélectionner une option : ")
        switch (operation) {
            case 1:
                AjouterDepartement();
                break;
            case 2:
                AfficheDepartement();
                break;
            case 3:
                UpdateDepartement();
                break;
            case 4:
                DeleteDepartement();
                break;
            case 5:
                ;
                break;
        }
    }

    static void AjouterDepartement() {
        // Get department information from user
        String intitule = Main.getStringInput("Intitulé du département : ");


        // Create new Departement object
        Departement departement = new Departement(intitule); // Assuming Departement constructor takes intitule

        // Add department to the BD (database)
        BD.departements.add(departement);

        System.out.println("Département ajouté avec succès.");
    }

    public static void AfficheDepartement() {
        // Check if there are any departments
        if (BD.departements.isEmpty()) {
            System.out.println("Aucun département n'est enregistré.");
            return;
        }

        // Print a header for the table
        System.out.println("Liste des départements :");
        System.out.println("------------------------");

        // Print each department's information
        for (Departement departement : BD.departements) {
            System.out.println("Id : " + departement.getId_dep()); // Assuming Departement has a getId() method
            System.out.println("Intitulé : " + departement.getIntitule()); // Assuming Departement has an getIntitule() method
        }
    }

    public static void UpdateDepartement() {
        // Get the ID of the department to update
        int id = Main.getIntInput("Veuillez saisir l'ID du département à modifier : ");

        // Find the department with the matching ID
        Departement departementToUpdate = null;
        for (Departement departement : BD.departements) {
            if (departement.getId_dep()== id) {
                departementToUpdate = departement;
                break;
            }
        }

        // If the department is found, update its information
        if (departementToUpdate != null) {
            String newIntitule = Main.getStringInput("Nouvel intitulé du département : ");
            departementToUpdate.setIntitule(newIntitule); // Assuming Departement has a setIntitule() method
            System.out.println("Département modifié avec succès.");
        } else {
            System.out.println("Département non trouvé.");
        }
    }

    public static void DeleteDepartement() {
        // Get the ID of the department to delete
        int id = Main.getIntInput("Veuillez saisir l'ID du département à supprimer : ");

        // Find the department with the matching ID
        Departement departementToDelete = null;
        for (Departement departement : BD.departements) {
            if (departement.getId_dep() == id) {
                departementToDelete = departement;
                break;
            }
        }
    }
}
