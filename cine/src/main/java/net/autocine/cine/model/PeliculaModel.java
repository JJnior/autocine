package net.autocine.cine.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_peliculas")
public class PeliculaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codpel")
	private Integer id;
	@Column(name = "rutpel")
	private String ruta;
	@Column(name = "nompel")
	private String nombre;
	@Column(name = "despel")
	private String descripcion;
	@Column(name = "durpel")
	private Integer duracion;
	@Column(name = "prepel")
	private double precio;
	@Column(name = "catpel")
	private String categoria;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
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
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "PeliculaModel [id=" + id + ", ruta=" + ruta + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", duracion=" + duracion + ", precio=" + precio + ", categoria=" + categoria + "]";
	}
	
}
