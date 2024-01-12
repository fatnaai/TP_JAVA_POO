package tp_java_POO.Phase1.models;

public class Filiere {
    private  int id_fil;
    private  String institue;
    private Enseignant responsable;
    private Departement departement;
    public Filiere(String institue, Enseignant responsable, Departement departement){

    }
    public Filiere(  int id_fil,String institue,Enseignant responsable,Departement departement){
        this.institue=institue;
        this.responsable=responsable;
        this.departement=departement;

    }

    public int getId_fil() {
        return id_fil;
    }

    public void setId_fil(int id_fil) {
        this.id_fil = id_fil;
    }

    public String getInstitue(){

        return institue;
    }

    public void setInstitue(String institue) {

        this.institue = institue;
    }

    public Enseignant getResponsable() {

        return responsable;
    }

    public void setResponsable(Enseignant responsable) {

        this.responsable = responsable;
    }

    public Departement getDepartement() {

        return departement;
    }

    public void setDepartement(Departement departement) {

        this.departement = departement;
    }
}
