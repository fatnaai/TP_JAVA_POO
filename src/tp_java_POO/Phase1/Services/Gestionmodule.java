package tp_java_POO.Phase1.Services;
import tp_java_POO.Phase1.models.Enseignant;
import tp_java_POO.Phase1.models.Filiere;
import tp_java_POO.Phase1.models.Module;
import java.util.ArrayList;
import java.util.List;

public class Gestionmodule {

        private List<Module> modules;
        public Gestionmodule(){
            modules=new ArrayList<>();
        }
    public void Ajoutemodule(String institule,Filiere filiere,Enseignant professeur){

        int idModule = 3;
        Module module=new Module(idModule,institule,filiere,professeur);
        modules.add(module);
    }
    public void AfficheDepartement(){
        //use for each to show all departement
        for(Module module:modules){
            System.out.println("Institile:"+module.getIntitule());
            System.out.println("Filiere:"+module.getFiliere());
            System.out.println("professeur"+module.getProfesseur());
        }
    }
    public void UpdateDepartement(String oldInstitule, String newInstitule, Filiere newfilier,Enseignant newProfesseur){
        for(Module module:modules){
            if(module.getIntitule().equals(oldInstitule)){
                module.setIntitule(newInstitule);
                module.setFiliere(newfilier);
                module.setProfesseur(newProfesseur);
            }
        }
    }
    public void DeleteModule(String institule) {
            for (Module module:modules) {
            if (module.getIntitule().equals(institule)) {
                modules.remove(module);
            }
        }
    }

}
