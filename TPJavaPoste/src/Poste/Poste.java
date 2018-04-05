/* Created by riccardild on Apr 4, 2018 3:46:24 PM
 * (C) Copyright Gianni Riccardi.
 */
package Poste;
import java.util.Random;

/**
 *
 * @author riccardild
 */
public class Poste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb_usagers, nb_guichets, capacité;
        
        nb_usagers = getRandomNumber(200, 300);
        nb_guichets = getRandomNumber(1, 5);
        
        System.out.println("\nNuméro d'usagers : " + nb_usagers + ".\n");
        System.out.println("\nNuméro de guichets : " + nb_guichets + ".\n");
        
        BureauImplemente Bureau = new BureauImplemente(nb_guichets);
        for(int i = 0; i < nb_guichets; i++) {
            capacité = getRandomNumber(10, 15);
            Bureau.guichets[i] = Bureau.ouvrirNouveauGuichet(capacité);
        }
        
        for(int i = 1; i < nb_usagers+1; i++) Bureau.ajouterUsager(i);
        
        for(int i = 1; i < nb_guichets+1; i++) {
            System.out.println("\nGuichet numéro " + i + " : \n");
            int usager_suivant = Bureau.premierUsager(Bureau.guichets[i-1]);
            if(usager_suivant == 0) 
                System.out.println("\n Le guichet est vide.\n");
            else {
                System.out.println("\n Usager correctement defilé");
                System.out.println(" Prochain usager à défiler : " + usager_suivant + ".\n");
            }
        }
    }
    
    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        int n;
        n = rand.nextInt((max - min) + 1) + min; // Donne un int entre min et max.
        return n;
    }
}
