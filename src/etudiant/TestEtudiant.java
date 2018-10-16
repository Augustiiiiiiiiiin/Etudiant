/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;
import java.util.Scanner;

/**
 *
 * @author Gugus
 */
public class TestEtudiant {
    
    public static void main(String args[]) {
        String nom=null;
        String prenom=null;
        int id;
        Etudiant personne =new Etudiant();
        Etudiant personne2;
        
        System.out.println("nom : " + personne.nom + " id : " + personne.getId());
        int entier;
        float tableau[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier :");
        entier=sc.nextInt();

        if (entier < 0) {
            System.out.println("le nombre est négatif");
            System.exit(0);
        }
        
        tableau=new float [entier];
        for (int i=0;i< tableau.length; i++){
            System.out.println("Taille tableau");
            tableau[i]=sc.nextFloat();
        }
        
        personne2=new Etudiant(tableau);
        System.out.println("Veuillez saisir un entier :");
        id=sc.nextInt();
        System.out.println("Veuillez saisir un entier :");
        nom=sc.nextLine();
        System.out.println("Veuillez saisir un entier :");
        prenom=sc.nextLine();
    }
    
    personne.modify(id, tableau, tableau.length, nom, prenom);
    
    
    System.out.println(personne.getIdentifiant());
    System.out.println(personnean.getTaille());
    System.out.println(personne.prenom);
    System.out.println(personne.nom);
}
