/*  Created by riccardild on Apr 4, 2018 3:50:32 PM
 *  (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;

/**
 *
 * @author riccardild
 */
public class GuichetPrioritaire extends Guichet{
    public int numéro;
    
    public GuichetPrioritaire (int capacité, int numéro) {
        super(capacité);
        this.numéro = numéro;
    }
    
    @Override
    public String toString() {
        return "\n Le guichet prioritaire " + this.numéro 
                + " peut recevoir au maximum " + this.capacité 
                + " usager(s).\n";
    }
}
