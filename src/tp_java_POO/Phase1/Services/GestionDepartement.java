package tp_java_POO.Phase1.Services;


import tp_java_POO.Phase1.models.Departement;
import tp_java_POO.Phase1.models.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class GestionDepartement {
    private List<Departement> departements;
    public GestionDepartement(){

        departements=new ArrayList<>();
    }
    public void AjouteDepartement(String institule, Enseignant responsable){
        Departement departement=new Departement(institule,responsable);
        departements.add(departement);
    }
    public void AfficheDepartement(){
        //use for each to show all departement
          for(Departement departement:departements){
              System.out.println("Institile:"+departement.getIntitule());
              System.out.println("Responsable:"+departement.getRespensable().getNom()+"  "+departement.getRespensable().getPrenom());
          }
    }
    public void UpdateDepartement(String oldInstitule, String newInstitule, Enseignant newResponsable){
        for(Departement departement:departements){
            if(departement.getIntitule().equals(oldInstitule)){
                departement.setIntitule(newInstitule);
                departement.setRespensable(newResponsable);
            }
        }
    }
    public void DeleteDepartement(String institule) {
        for (Departement departement : departements) {
            if (departement.getIntitule().equals(institule)) {
                departements.remove(departement);
            }
        }
    }


}
