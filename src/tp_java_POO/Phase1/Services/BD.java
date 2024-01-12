package tp_java_POO.Phase1.Services;

import java.util.ArrayList;
import java.util.List;

import tp_java_POO.Phase1.models.Departement;
import tp_java_POO.Phase1.models.Module;
import tp_java_POO.Phase1.models.Note;
import tp_java_POO.Phase1.models.Enseignant;
import tp_java_POO.Phase1.models.Filiere;
import tp_java_POO.Phase1.models.Etudiant;
public class BD {
    public static int DEPT_ID = 0;
    public static int ENS_ID = 0;
    public static int ETD_ID = 0;
    public static int FIL_ID = 0;
    public static int MOD_ID = 0;
    public static ArrayList<Departement> departements = new ArrayList<Departement>();
    public static ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
    public static ArrayList<Filiere> filieres = new ArrayList<Filiere>();
    public static ArrayList<Module> modules = new ArrayList<Module>();
    public static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public static ArrayList<Note> notes = new ArrayList<Note>();
    public  static int getDeptId(){
        DEPT_ID++;
        return DEPT_ID;
    }
    public  static int getEnsId(){
        ENS_ID++;
        return ENS_ID;
    }

    public static int getEtdId() {
        ETD_ID++;
        return ETD_ID;
    }

    public static int getModId() {
        MOD_ID++;
        return MOD_ID;
    }
    public static int getFilId() {
        FIL_ID++;
        return FIL_ID;
    }

    public static void setFilId(int filId) {
        FIL_ID = filId;
    }


}

