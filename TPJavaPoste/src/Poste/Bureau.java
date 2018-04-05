/*  Created by riccardild on Apr 5, 2018
 *  (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;

/**
 *
 * @author riccardild
 */
public interface Bureau {
    public Guichet ouvrirNouveauGuichet (int capacité) ; 
    public void ajouterUsager (int numéro) ;
    public int premierUsager (Guichet g) ;
}
