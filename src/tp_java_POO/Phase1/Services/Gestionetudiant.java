package tp_java_POO.Phase1.Services;

import tp_java_POO.Phase1.models.Etudiant;
import tp_java_POO.Phase1.models.Filiere;

import java.util.ArrayList;
import java.util.List;
public class Gestionetudiant {
    private List<Etudiant> etudiants;
    public Gestionetudiant(){
        etudiants=new ArrayList<>();
    }
    public void AjouteEtudiant(String nom, String prenom, String email, int apogee, Filiere filier){
        Etudiant etudiant=new Etudiant(nom,prenom,email,apogee,filier);
        etudiants.add(etudiant);
        }
    public void AfficheEtudiant(){
        for( Etudiant etudiant : etudiants){
            System.out.println("nom:"+etudiant.getNom()+"| prenom"+etudiant.getPrenom()+"| Filiere:"+etudiant.getFiliere());
        }
    }
    public void UpdateEtudiant(String oldNom, String newNom, String newPrenom, String newEmail, int newApogee, Filiere newFiliere){
        for(Etudiant etudiant:etudiants){
            if(etudiant.getNom().equals(oldNom)){
                etudiant.setNom(newNom);
                etudiant.setPrenom(newPrenom);
                etudiant.setEmail(newEmail);
                etudiant.setApogee(newApogee);
                etudiant.setFiliere(newFiliere);
            }
        }
    }
    public void DeleteEtudiant(String nom){
        for(Etudiant etudiant:etudiants){
            if(etudiant.getNom().equals(nom)){
                etudiants.remove(etudiant);
            }
        }
    }
}