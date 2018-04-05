/*  Created by riccardild on Apr 4, 2018 3:48:56 PM
 *  (C) Copyright Gianni Riccardi.
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
