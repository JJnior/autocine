package net.autocine.cine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.autocine.cine.model.PeliculaModel;

@Controller
public class PeliculaController {

	@GetMapping("/peliculas1")
	public String peliculas(Model model) {
		PeliculaModel pelicula = new PeliculaModel();
		pelicula.setId(1);
		pelicula.setRuta("/image/1.jpg");
		pelicula.setNombre("THE BATMAN");
		pelicula.setDescripcion("pelicula de batman");
		pelicula.setDuracion(180);
		pelicula.setPrecio(25.0);
		pelicula.setCategoria("accion");
		model.addAttribute("pelicula", pelicula);
		return "carteleraa";
	}
}

//no hace nada
