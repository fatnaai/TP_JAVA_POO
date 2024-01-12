package tp_java_POO.Phase1.controls;

import tp_java_POO.Phase1.Main;
import tp_java_POO.Phase1.Services.BD;
import tp_java_POO.Phase1.models.Etudiant;
import tp_java_POO.Phase1.models.Filiere;


public class EtudientController{


        public static void showMenu() {
            System.out.println("-------------------------[ Etudiantes]---------------------------");


            System.out.println("1: Pour ajouter un Etudiant");
            System.out.println("2: Pour afficher les Etudiants");
            System.out.println("3: Pour modifier un Etudiant");
            System.out.println("4: Pour supprimer un Etudiant");
            System.out.println("0: Pour retourner au menu principal");
            int operation = Main.getIntInput("Veuillez saisir une operation");
            //"Veuillez sélectionner une option : ")
            switch (operation) {
                case 1:
                    AjouterEtudiant();
                    break;
                case 2:
                    AfficheEtudiant();
                    break;
                case 3:
                    UpdateEtudiant();
                    break;
                case 4:
                    DeleteEtudiant();
                    break;
                case 5:

                    break;
            }
        }

    private static void AfficheEtudiant() {

    }

    public static void AjouterEtudiant() {
//            // Get étudiant information from user (e.g., nom, prenom, etc.)
//            String nom = Main.getStringInput("Nom de l'étudiant : ");
//            String prenom = Main.getStringInput("Prénom de l'étudiant : ");
//            int idDepartement = Main.getIntInput("ID du département : ");
//
//
//
//            // Create new Etudiant object
//        Etudiant etudiant = new Etudiant(nom,prenom,idDepartement,filier);
//
//            // Add étudiant to the BD (database)
//            BD.etudiants.add(etudiant);  // Assuming a list of étudiants in BD
//
//            System.out.println("Etudiant ajouté avec succès.");
        }

        public static void AfficheEtudiants() {
            // Check if there are any étudiants
            if (BD.etudiants.isEmpty()) {
                System.out.println("Aucun étudiant n'est enregistré.");
                return;
            }

            // Print a header for the table
            System.out.println("Liste des étudiants :");
            System.out.println("------------------------");

            // Print each étudiant's information
            for (Etudiant etudiant : BD.etudiants) {
                System.out.println("Id : " + etudiant.getId_et());  // Assuming Etudiant has an getId() method
                System.out.println("Nom : " + etudiant.getNom());  // Assuming Etudiant has a getNom() method
                System.out.println("Prénom : " + etudiant.getPrenom());  // Assuming Etudiant has a getPrenom() method
                // ... (print other étudiant details)
            }
        }

        public static void UpdateEtudiant() {
            // Get the ID of the étudiant to update
            int id = Main.getIntInput("Veuillez saisir l'ID de l'étudiant à modifier : ");

            // Find the étudiant with the matching ID
            Etudiant etudiantToUpdate = null;
            for (Etudiant etudiant : BD.etudiants) {
                if (etudiant.getId_et() == id) {
                    etudiantToUpdate = etudiant;
                    break;
                }
            }

//            // If the étudiant is found, update its information
//            if (etudiantToUpdate != null) {
//                String nom = Main.getStringInput("Nouveau nom de l'étudiant : ");
//                String prenom = Main.getStringInput("Nouveau prénom de l'étudiant : ");
//                int idDepartement = Main.getIntInput("Nouveau ID du département : ");
//                // ... (update other étudiant details)
//                etudiantToUpdate.setNom(nom);
//                etudiantToUpdate.setPrenom(prenom);
//                etudiantToUpdate.getId_et(idDepartement);
//                // ... (update other étudiant details)
//                System.out.println("Etudiant modifié avec succès.");
//            } else {
//                System.out.println("Etudiant non trouvé.");
//            }
        }

        public static void DeleteEtudiant() {
            // Get the ID of the étudiant to delete
            int id = Main.getIntInput("Veuillez saisir l'ID de l'étudiant à supprimer : ");

            // Find the étudiant with the matching ID
            Etudiant etudiantToDelete = null;
            for (Etudiant etudiant : BD.etudiants) {
                if (etudiant.getId_et() == id) {
                    etudiantToDelete = etudiant;
                    break;
                }
            }

            // If the étudiant is found, delete it from the BD
            if (etudiantToDelete != null) {
                BD.etudiants.remove(etudiantToDelete);
                System.out.println("Etudiant supprimé avec succès.");
            } else {
                System.out.println("Etudiant non trouvé.");
            }
        }


        }

