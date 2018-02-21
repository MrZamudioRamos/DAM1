package JuegoAjedrez;

public class Movimiento extends Tablero {

    
    int posInicial;
    int posFinal;

    public Movimiento(int posInicial, int posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public int getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(int posInicial) {
        this.posInicial = posInicial;
    }

    public int getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(int posFinal) {
        this.posFinal = posFinal;
    }

    public boolean esVertical() {

        return true;
    }

    public boolean esHorizontal() {
        return false;
    }

    public boolean esDiagonal() {
        return false;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }

}
