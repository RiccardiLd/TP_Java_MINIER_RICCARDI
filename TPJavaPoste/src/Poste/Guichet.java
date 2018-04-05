/*  Created by riccardild on Apr 5, 2018 
 *  (C) Copyright Gianni Riccardi and Théo Minier.
 */
package Poste;

/**
 *
 * @author riccardild
 */
public class Guichet {
    // tableau (file d’attente du guichet) privé des numéros entiers d’usagers (*)
    private final int usagers[];
    // indice du premier usager (le plus ancien dans le tableau)
    protected int id ; 
    // nombre d’usagers dans le tableau
    public int nb_usagers ; 
    // capacité maximale d’usagers du tableau
    public int capacité ;
    
    // constructeur
    public Guichet (int capacité) {
        this.capacité = capacité;
        this.id = 0;
        this.nb_usagers = 0;
        this.usagers = new int[capacité];
    } 
    
    // retourne true si nombre d’usagers=0, sinon false
    public boolean guichetVide() {
        return (nb_usagers == 0);
    }
    
    // retourne true si nombre d’usagers=capacité, sinon false 
    public boolean guichetPlein() {
        return (nb_usagers == capacité);
    }
    
    // défile et retourne le numéro du premier usager du tableau 
    public int premierUsager () {
        if(!guichetVide()){
            nb_usagers--;
            usagers[id] = 0;
            // Incrementation circulaire d'id
            if(id == capacité) id = 0;
            else id++;
            
            return usagers[id];
        }
        return 0;
    }
    
    // ajoute (enfile) un usager dans le tableau
    public void ajouterUsager (int numéro) {
        if(!guichetPlein()){
            usagers[(id+nb_usagers)%capacité] = numéro;
            nb_usagers++;
        }
        else System.out.println("\nLe guichet est plein.\n");
    }
}
