package tp_java_POO.Phase1.models;
public class Note {
    private int idnote;
    private float valeur;
    private Etudiant idetudiant;
    private Filiere idfiliere;
    private Module idmodule;

    public Note(float valeur, Etudiant idetudiant, Filiere idfiliere, java.lang.Module idmodule, int idnote){

    }
     public Note( int idnote,float valeur , Etudiant idetudiant,Filiere idfiliere,Module idmodule){
          this.idnote=idnote;
         this.valeur=valeur;
         this.idetudiant= idetudiant;
         this.idfiliere=idfiliere;
         this.idmodule=idmodule;
     }

    public int getIdnote() {
        return idnote;
    }

    public void setIdnote(int idnote) {
        this.idnote = idnote;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public Etudiant getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(Etudiant idetudiant) {
        this.idetudiant = idetudiant;
    }

    public Filiere getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(Filiere idfiliere) {
        this.idfiliere = idfiliere;
    }

    public Module getIdmodule() {
        return idmodule;
    }

    public void setIdmodule(Module idmodule) {
        this.idmodule = idmodule;
    }
}


