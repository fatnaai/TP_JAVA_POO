package tp_java_POO.Phase1.Services;

import tp_java_POO.Phase1.models.Departement;
import tp_java_POO.Phase1.models.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class GestionEnseignant {
    private List<Enseignant>enseignants;
    private GestionEnseignant(){
        enseignants =new ArrayList<>();

    }
    public void ajouteEnseignant( String nom,String prenom,String email,String grade, Departement departement) {
        Enseignant enseignant=new Enseignant( nom,prenom,email,grade,departement);
        enseignants.add(enseignant);
    }
    public void AfficheEnseignant(){
        for(Enseignant enseignant:enseignants){
            System.out.println("nom: " +enseignant.getNom()+"| prenom"+enseignant.getPrenom());
        }
    }
    public void UpdateEnseignant(String oldNom, String newNom, String newPrenom, String newEmail, String newGrade, Departement newDepartement){
        for(Enseignant enseignant:enseignants){
            if(enseignant.getNom().equals(oldNom)){
                enseignant.setNom(newNom);
                enseignant.setPrenom(newPrenom);
                enseignant.setEmail(newEmail);
                enseignant.setGrade(newGrade);
                enseignant.setDepartement(newDepartement);
            }
        }
    }
    public void DeleteEnseignant(String nom){
        for(Enseignant enseignant:enseignants){
            if(enseignant.getNom().equals(nom)){
                enseignants.remove(enseignant);
            }
        }
    }
}