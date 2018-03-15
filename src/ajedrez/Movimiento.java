package ajedrez;
/**
 * 
 * @author Ricardo
 */
public class Movimiento {

    private Posicion posInicial;
    private Posicion posFinal;

    public Movimiento() {

    }
    /**
     * 
     * @param posInicial
     * @param posFinal 
     */
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    public boolean movTorreVertical() {
        boolean esVertical = true;
        if (posInicial.getFila() == posFinal.getFila() || posInicial.getColumna() == posFinal.getColumna()) {
            esVertical = true;
        } else {
            esVertical = false;
        }
        return false;
    }

    public boolean movTorreHorizontal() {
        boolean esHorizontal = true;
        if (posInicial.getFila() == posFinal.getFila() || posInicial.getColumna() == posFinal.getColumna()) {
            esHorizontal = true;
        } else {
            esHorizontal = false;
        }
        return false;
    }

    public boolean movAlfil() {
        boolean esDiagonal = true;

        if (Math.abs(posInicial.getFila() - posFinal.getFila()) == Math.abs(posInicial.getColumna() - posFinal.getColumna())) {
            esDiagonal = true;
        } else {
            esDiagonal = false;
        }
        return esDiagonal;
    }

    public boolean movCaballo() {
        boolean movEnEle = false;

        if ((posInicial.getFila() - posFinal.getFila()) * (posInicial.getColumna() - posFinal.getColumna()) == 5) {
            movEnEle = true;
        }
        return movEnEle;
    }

    public boolean movReina() {
        boolean movReina = false;

        if (posInicial.getFila() == posFinal.getFila() || posInicial.getColumna() == posFinal.getColumna() || (Math.abs(posInicial.getFila() - posFinal.getFila()) == Math.abs(posInicial.getColumna() - posFinal.getColumna()))) {
            movReina = true;
        }
        return movReina;
    }

    public boolean movRey() {
        boolean movRey = false;

        if (Math.abs(posInicial.getFila() - posFinal.getFila()) <= 1 && Math.abs(posInicial.getColumna() - posFinal.getColumna()) <= 1) {
            movRey = true;
        }
        return movRey;
    }

    public boolean primerMovPeon() {
        boolean primerMov = false;

        return primerMov;

    }

    public boolean movPeon() {
        boolean movPeon = false;

        return movPeon;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }

}
