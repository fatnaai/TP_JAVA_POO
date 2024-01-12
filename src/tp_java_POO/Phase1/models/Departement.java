package tp_java_POO.Phase1.models;

public class Departement {
    int id_dep;
   private  String intitule;
   private Enseignant respensable;
    private int id;
    public Departement(String intitule){

    }
    public Departement( String intitule,Enseignant respensable){
        this.intitule=intitule;
        this.respensable=respensable;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setRespensable(Enseignant respensable) {
        this.respensable = respensable;
    }

    public Enseignant getRespensable() {
        return respensable;
    }

    public int getId_dep() {
        return id;
    }

    public void setId(String id_dep) {
        this.id = id;
    }
}
