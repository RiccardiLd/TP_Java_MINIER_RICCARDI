/*  Created by riccardild on Apr 5, 2018 
 *  (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;

/**
 *
 * @author riccardild
 * @author theo
 */
public class BureauImplemente {
    public int nb_guichets;
    public Guichet guichets[];
    
    public BureauImplemente(int nb_guichets) {
        this.nb_guichets = nb_guichets;
        this.guichets = new Guichet[nb_guichets];
    }
    
    public Guichet ouvrirNouveauGuichet(int capacité) {
        Guichet nouveauGuichet = new Guichet(capacité); 
        return nouveauGuichet;
    }
    
    public void ajouterUsager(int numéro) {
        int min = Integer.MAX_VALUE;
        int id_min = -1;
        for(int i = 0; i<nb_guichets; i++){
            if(!guichets[i].guichetPlein()) {
               if(guichets[i].nb_usagers < min) {
                   min = guichets[i].nb_usagers;
                   id_min = i;
               }
            }
        }
        if(id_min < 0) System.out.println("\nLe bureau est saturé.");
        else {
            guichets[id_min].ajouterUsager(numéro);
            System.out.println("\nUsager " + numéro 
                               + " correctement ajouté au guichet " + (id_min + 1) 
                               + ".\n");
        }
    }
    
    public int premierUsager(Guichet g){
        return g.premierUsager();
    }
}
