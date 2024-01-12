package tp_java_POO.Phase1.Services;

import tp_java_POO.Phase1.models.Departement;
import tp_java_POO.Phase1.models.Enseignant;
import tp_java_POO.Phase1.models.Filiere;

import java.util.ArrayList;
import java.util.List;
public class GestionFilier {
    private List<Filiere> filiers;
     public GestionFilier(){
         filiers=new ArrayList<>();
    }
     public void AjouteFilier(String institue, Enseignant responsable, Departement departement){
         Filiere filier=new Filiere(institue,responsable,departement);

     }
    public void AfficheFilier(){
        for(Filiere filier:filiers){
            System.out.println(filier);
        }
    }
    public void UpdateFIliere(String oldInstitue, String newInstitue, Enseignant newResponsable, Departement newDepartement){
        for(Filiere filier:filiers){
            if(filier.getInstitue().equals(oldInstitue)){
                filier.setInstitue(newInstitue);
                filier.setResponsable(newResponsable);
                filier.setDepartement(newDepartement);
            }
        }
    }

    public void DeleteFilier(String institue) {
        for (Filiere filier : filiers) {
            if (filier.getInstitue().equals(institue)) {
                filiers.remove(filier);
            }
        }
    }
}