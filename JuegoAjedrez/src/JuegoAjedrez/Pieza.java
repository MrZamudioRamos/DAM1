package JuegoAjedrez;

public class Pieza extends Tablero {
	
	private String color;
	private String nombre;
	
	public Pieza(String color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pieza [color=" + color + ", nombre=" + nombre + "]";
	}
	
	
}
