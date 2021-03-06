package m11.model;

public abstract class Producto {
	private double precio;
	
	public Producto(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String toString();
}
