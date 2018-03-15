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

    public Rey(char color, char nombre) {
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
    public boolean movimientoValido(Movimiento mov) {
        return false;
    }


}
