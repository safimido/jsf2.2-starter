package tp.Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by ElMehdi Safieddine.
 */
@ManagedBean(name = "etudiant")
@SessionScoped
public class Etudiant implements Serializable{
    private String cne;
    private String prenom;
    private String nom;
    private String ville;
    private String dateNaissance;
    private Integer bourse;

    /**
     * Constructor
     */
    public Etudiant() {
    }

    /**
     * Getters and Setters
     */
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Integer getBourse() {
        return bourse;
    }

    public void setBourse(Integer bourse) {
        this.bourse = bourse;
    }
}
