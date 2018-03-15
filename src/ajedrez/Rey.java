/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Ricardo
 */
public class Rey extends Pieza {

    String pieza;

    public Rey() {
    }

    public Rey(String color, String nombre) {
        super(color, nombre);
    }

    public boolean puedeMoverse(Movimiento mov) {
        
        boolean puedeMoverse = false;

        if (mov.movRey()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public String figuraPieza() {
        if (this.getColor().compareToIgnoreCase("blanca") == 0) {
            pieza = "2654";
        } else {
            pieza = "265A";
        }
        return pieza;
    }

}
