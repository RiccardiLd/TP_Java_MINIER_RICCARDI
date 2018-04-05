/* Created by riccardild on Apr 5, 2018
 * (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;
import java.util.Random;
import java.util.Scanner;  

/**
 *
 * @author riccardild
 * @author theo
 */
public class Poste {
    
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
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
        
        for(int i = 1; i < nb_usagers+1; i++) {
            Bureau.ajouterUsager(i);
        }
        
        for(int i = 1; i < nb_guichets+1; i++) {
            System.out.println("\nGuichet numéro " + i + " : \n");
            int usager_suivant = Bureau.premierUsager(Bureau.guichets[i-1]);
            if(usager_suivant == 0) {
                System.out.println("\n Le guichet est vide.\n");
            }
            else {
                System.out.println("\n Usager correctement defilé");
                System.out.println(" Prochain usager à défiler : " + usager_suivant + ".\n");
            }
        }
        System.out.println("\n Entrez un numéro de guichet entre 1 et " + nb_guichets + ":\n");
        do {
            num = sc.nextInt(); 
        }while(num < 0 || num > nb_guichets);
        
        capacité = getRandomNumber(10, 15);
        GuichetPrioritaire guichet = new GuichetPrioritaire(capacité, num);
        System.out.println(guichet.toString());
    }
    
    /**
     * 
     * @param min minimum
     * @param max maximum
     * @return random number between min and max
     */
    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        int n;
        n = rand.nextInt((max - min) + 1) + min; // Donne un int entre min et max.
        return n;
    }
}
