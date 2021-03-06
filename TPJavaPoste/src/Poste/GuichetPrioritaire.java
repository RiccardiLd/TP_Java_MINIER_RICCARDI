/*  Created by riccardild on Apr 5, 2018
 *  (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;

/**
 *
 * @author riccardild
 * @author theo
 */
public class GuichetPrioritaire extends Guichet{
    public int numéro;
    /**
     * 
     * @param capacité capacité du guichet
     * @param numéro numéro du guichet prioritaire
     */
    public GuichetPrioritaire (int capacité, int numéro) {
        super(capacité);
        this.numéro = numéro;
    }
    /**
     * 
     * @return string avec spécifications du guichet prioritaire
     */
    @Override
    public String toString() {
        return "\n Le guichet prioritaire " + this.numéro 
                + " peut recevoir au maximum " + this.capacité 
                + " usager(s).\n";
    }
}
