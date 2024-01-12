package tp_java_POO.Phase1.models;

public class Module {
    private int idModule;
    private  String intitule;
    private Filiere filiere;
    private Enseignant professeur;
    public Module(){

    }
    public Module( int idModule,String institule,Filiere filiere ,Enseignant professeur){
        this.idModule=idModule;
       this.intitule=institule;
       this.professeur=professeur;
       this.filiere=filiere;

    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Enseignant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }
}
