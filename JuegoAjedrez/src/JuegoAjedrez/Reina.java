/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoAjedrez;

/**
 *
 * @author Ricardo
 */
public class Reina extends Pieza {
    String pieza;

    public Reina(String pieza) {
        this.pieza = pieza;
    }

    public Reina(String pieza, String color, String nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    @Override
    public String figuraPieza() {
        if(this.getColor().compareToIgnoreCase("blanca")==0){
            pieza = "2655";
        }else{
            pieza = "265B";
        }
        return pieza;
    }
    
}
