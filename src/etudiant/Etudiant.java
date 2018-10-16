/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author Gugus
 */
public class Etudiant {
    
    private String id; 
    private float notes[]; 
    private int taille; 
    
    public String nom;
    public String prenom; 

    
    /**
     * @param args the command line arguments
     */
    public Etudiant () {
        // TODO code application logic here
        this.id = null;
        this.taille = 0;
        this.notes = null;
    }
    
    public Etudiant (float tab[]) { 
        this.taille=notes.length;
        
    }
    
    void Modify (String id, float notes[], int taille, char nom, char prenom){
        this.id = id;
        this.notes = notes;
        this.taille = taille;
        this.nom = nom;
        this.prenom = prenom; 
    }

    public String getId() {
        return id;
    }

    public float[] getNotes() {
        return notes;
    }

    public int getTaille() {
        return taille;
    }
    
}

