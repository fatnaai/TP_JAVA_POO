package tp_java_POO.Phase1.models;

public class Enseignant {
    int id_en;
    public String nom;
    public String prenom;
    public String email;
    private  String grade;
    private Departement departement;
    public Enseignant(String nom, String prenom, String email, String grade, Departement departement){

    }
    public Enseignant( int id_en,String nom,String prenom,String email,String grade, Departement departement){
       this.id_en=id_en;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.grade=grade;
        this.departement=departement;

    }

    public int getId_en() {
        return id_en;
    }

    public void setId_en(int id_en) {
        this.id_en = id_en;
    }

    public String getNom() {

        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGrade() {

        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Departement getDepartement() {
        return departement;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
