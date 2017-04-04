package tp.Controller;

import tp.Model.Etudiant;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by ElMehdi Safieddine.
 */
@ManagedBean(name = "gestionEtudiant")
@SessionScoped
public class GestionEtudiant implements Serializable{

    @ManagedProperty(value = "#{etudiant}")
    Etudiant etudiant;

    /**
     * Constructor
     * */
    public GestionEtudiant() {
    }

    /**
     * Gestion Etudiants Actions Methods
     */
    public String validerEtudiant() {
        return "/gestionEtudiant?faces-redirect=true";
    }

    public String rechercherEtudiant() {
        return "";
    }

    public String modifierEtudiant() {
        return "";
    }

    public String supprimerEtudiant() {
        return "";
    }

    /**
     * Getters and Setters
     * */
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
