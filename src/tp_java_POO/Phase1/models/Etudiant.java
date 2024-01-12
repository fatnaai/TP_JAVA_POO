package tp_java_POO.Phase1.models;

public class Etudiant {
     private int id_et;
    private String nom;
    private String  prenom;
    private String email;
    private int apogee;
    private Filiere filiere;
    public Etudiant(String nom, String prenom, String email, int apogee, Filiere filier){


    }
    public Etudiant( int id_et, String name,String prenom,String email,int apogee,Filiere filier){
        this.id_et=id_et;
        this.nom=name;
        this.prenom=prenom;
        this.email=email;
        this.apogee=apogee;
        this.filiere=filier;
    }

    public int getId_et() {
        return id_et;
    }

    public void setId_et(int id_et) {
        this.id_et = id_et;
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

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
