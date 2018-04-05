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
    /**
     * 
     * @param nb_guichets nombre de guichets du bureau
     */
    public BureauImplemente(int nb_guichets) {
        this.nb_guichets = nb_guichets;
        this.guichets = new Guichet[nb_guichets];
    }
    /**
     * 
     * @param capacité capacité du guichet créé
     * @return guichet créé
     */
    public Guichet ouvrirNouveauGuichet(int capacité) {
        Guichet nouveauGuichet = new Guichet(capacité); 
        return nouveauGuichet;
    }
    /**
     * 
     * @param numéro numéro d'usager à rajouter
     */
    public void ajouterUsager(int numéro) {
        ///Tri du guichet le "plus vide"
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
        ///Dans la condition si au moins un guichet est disponible
        if(id_min < 0) System.out.println("\nLe bureau est saturé.");
        else {
            guichets[id_min].ajouterUsager(numéro);
            System.out.println("\nUsager " + numéro 
                               + " correctement ajouté au guichet " + (id_min + 1) 
                               + ".\n");
        }
    }
    /**
     * 
     * @param g guichet auquel s'affectera la fonction premierUsager
     * @return premier usager du tableau
     */
    public int premierUsager(Guichet g){
        return g.premierUsager();
    }
}
