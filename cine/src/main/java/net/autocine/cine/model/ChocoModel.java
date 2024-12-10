package net.autocine.cine.model;

public class ChocoModel {
	private Integer id;
	private String ruta;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean disponible;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ChocoModel [id=" + id + ", ruta=" + ruta + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", disponible=" + disponible + "]";
	}
	
	
}
