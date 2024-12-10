package net.autocine.cine;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import net.autocine.cine.controller.MostrarPelicula;
import net.autocine.cine.model.PeliculaModel;
import net.autocine.cine.repository.PeliculaRepository;

@SpringBootApplication
//@EnableEurekaServer
public class CineApplication implements CommandLineRunner{
	
	@Autowired
	private PeliculaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//guardar();
		//modificar();
		//buscarPorId();
		//conteo();
		//eliminar();
		//cnsultar();
		//encontrarPorId();
		//buscarTodos();
		//existeById();
		//buscarTodosJpa();
		//buscarTodosOrdenados();
		eliminarTodos();
		
	}
	
	private void guardar() {
		PeliculaModel pel = new PeliculaModel();
		pel.setRuta("/image/venom3.jpg");
		pel.setNombre("Venom the last dance");
		pel.setDescripcion("En Venom: El Último Baile, Tom Hardy vuelve como Venom, uno de los más grandes y complejos personajes de Marvel, para cerrar su trilogía cinematográfica. Eddie y Venom están a la fuga. Perseguidos por sus sendos mundos y cada vez más cercados, el dúo se ve abocado a tomar una decisión devastadora que hará que caiga el telón sobre el último baile de Venom y Eddie.");
		pel.setDuracion(109);
		pel.setPrecio(25);
		pel.setCategoria("acción");
		repo.save(pel);
		System.out.println("guardado correctamente");
	}
	
	private void modificar() {
		Optional<PeliculaModel> optional = repo.findById(6);
		if (optional.isPresent()) {
			PeliculaModel pelTmp = optional.get();
			pelTmp.setRuta("/image/venom3.jpg");
			pelTmp.setNombre("Venom 3");
			pelTmp.setDescripcion("En Venom: El Último Baile, Tom Hardy vuelve como Venom, uno de los más grandes y complejos personajes de Marvel, para cerrar su trilogía cinematográfica. Eddie y Venom están a la fuga. Perseguidos por sus sendos mundos y cada vez más cercados, el dúo se ve abocado a tomar una decisión devastadora que hará que caiga el telón sobre el último baile de Venom y Eddie.");
			pelTmp.setDuracion(109);
			pelTmp.setPrecio(25);
			pelTmp.setCategoria("acción");
			repo.save(pelTmp);
			System.out.println(optional.get());
		}
		else 
			System.out.println("categoria no encontrada");
	}
	private void buscarPorId() {
		Optional<PeliculaModel> optional = repo.findById(7);
		if (optional.isPresent())
			System.out.println(optional.get());
		else 
			System.out.println("categoria no encontrada");
		
	}
	private void eliminar() {
		int idPelicula = 6;
		repo.deleteById(idPelicula);
		System.out.println("Eliminando un registro");
	}
	private void conteo() {
		long count = repo.count();
		System.out.println("total de datos: " + count);
	}
	private void cnsultar() {
		System.out.println("consultar datos");
	}
	private void eliminarTodos() {
		repo.deleteAll();
		System.out.println("eliminando todos los datos");
	}
	private void encontrarPorId() {
		List<Integer> ids = new LinkedList<Integer>();
		ids.add(1);
		ids.add(3);
		ids.add(5);
		
		Iterable<PeliculaModel> pelicula = repo.findAllById(ids);
		
		for(PeliculaModel pel : pelicula) {
			System.out.println(pel);
		}
	}
	private void buscarTodos() {
		Iterable<PeliculaModel> pelicula = repo.findAll();
		for(PeliculaModel pel : pelicula) {
			System.out.println(pel);
		}
	}
	private void existeById() {
		boolean existe = repo.existsById(8);
		System.out.println("la pelicula existe: " + existe);
	}
	private void guardarTodas() {
		List<PeliculaModel> peliculas = getListaPelicula();
		repo.saveAll(peliculas);
	}
	
	private List<PeliculaModel> getListaPelicula(){
		List<PeliculaModel> lista = new LinkedList<PeliculaModel>();
		
		PeliculaModel pel1 = new PeliculaModel();
		pel1.setRuta("/image/venom3.jpg");
		pel1.setNombre("Venom the last dance");
		pel1.setDescripcion("En Venom: El Último Baile, Tom Hardy vuelve como Venom, uno de los más grandes y complejos personajes de Marvel, para cerrar su trilogía cinematográfica. Eddie y Venom están a la fuga. Perseguidos por sus sendos mundos y cada vez más cercados, el dúo se ve abocado a tomar una decisión devastadora que hará que caiga el telón sobre el último baile de Venom y Eddie.");
		pel1.setDuracion(109);
		pel1.setPrecio(25);
		pel1.setCategoria("acción");
		
		PeliculaModel pel2 = new PeliculaModel();
		pel2.setRuta("/image/venom3.jpg");
		pel2.setNombre("Venom the last dance");
		pel2.setDescripcion("En Venom: El Último Baile, Tom Hardy vuelve como Venom, uno de los más grandes y complejos personajes de Marvel, para cerrar su trilogía cinematográfica. Eddie y Venom están a la fuga. Perseguidos por sus sendos mundos y cada vez más cercados, el dúo se ve abocado a tomar una decisión devastadora que hará que caiga el telón sobre el último baile de Venom y Eddie.");
		pel2.setDuracion(109);
		pel2.setPrecio(25);
		pel2.setCategoria("acción");
		
		return lista;
	}
	
	private void buscarTodosJpa() {
		List<PeliculaModel> peliculas = repo.findAll();
		for(PeliculaModel p: peliculas) {
			System.out.println(p.getId() + " " + p.getNombre());
		}
	}
	
	private void borrarTodoEnBloque() {
		repo.deleteAllInBatch();
	}
	
	private void buscarTodosOrdenados() {
		
		List<PeliculaModel> peliculas = repo.findAll(Sort.by("nombre"));
		for(PeliculaModel p: peliculas) {
			System.out.println(p.getId() + " " + p.getNombre());
		}
	}
}
