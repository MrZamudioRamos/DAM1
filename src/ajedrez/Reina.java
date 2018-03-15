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
public class Reina extends Pieza {

    String pieza;
    int valor = 10;

    public Reina(String pieza) {
        this.pieza = pieza;
    }

    public Reina(String pieza, char color, char nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    public int getValor(){
        return valor;
    }

    public boolean puedeMoverse(Movimiento mov) {
        boolean puedeMoverse = false;

        if (mov.movReina()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public boolean movimientoValido(Movimiento mov) {
        return false;
    }

}
