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
public class Torre extends Pieza{
    String pieza;

    public Torre(String pieza) {
        this.pieza = pieza;
    }

    public Torre(String pieza, String color, String nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    @Override
    public String figuraPieza() {
        if(this.getColor().compareToIgnoreCase("blanca")==0){
            pieza = "2656";
        }else{
            pieza = "265C";
        }
        return pieza;
    }
    
    
}
