package net.autocine.cine.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.autocine.cine.model.ChocoModel;
import net.autocine.cine.model.PeliculaModel;
import net.autocine.cine.service.PeliculaService;

@Controller
public class InicioController {
	
	@Autowired
	private PeliculaService servicePelicula;
	
	@GetMapping("/")
	public String inicio(Model model) {
		List<PeliculaModel> lista = servicePelicula.buscarTodas();
		model.addAttribute("pelicula", lista);
		return "autocine";
	}
	@GetMapping("/chocolateria")
	public String choco(Model model) {
		List<ChocoModel> lista = getChoco();
		model.addAttribute("choco", lista);
		return "choco";
	}
	@GetMapping("/peliculas")
	public String pelicula(Model model) {
		List<PeliculaModel> lista = servicePelicula.buscarTodas();
		model.addAttribute("pelicula", lista);
		return "cartelera";
	}
	
	private List<ChocoModel> getChoco(){
		List<ChocoModel> lista = new LinkedList<ChocoModel>();
		try {
			ChocoModel choco1 = new ChocoModel();
			choco1.setId(1);
			choco1.setRuta("/image/combo2.jpg");
			choco1.setNombre("combo 1");
			choco1.setDescripcion("1 vaso mediano + 1 cancha mediana + cañonazo");
			choco1.setPrecio(17.5);
			choco1.setDisponible(true);
			
			ChocoModel choco2 = new ChocoModel();
			choco2.setId(2);
			choco2.setRuta("/image/combo1.png");
			choco2.setNombre("combo 2");
			choco2.setDescripcion("2 vasos chicos + 2 canchas chicas");
			choco2.setPrecio(22.5);
			choco2.setDisponible(true);
			
			ChocoModel choco3 = new ChocoModel();
			choco3.setId(3);
			choco3.setRuta("/image/combo3.jpg");
			choco3.setNombre("combo 3");
			choco3.setDescripcion("2 vasos mediano + 1 cancha gigante");
			choco3.setPrecio(27.5);
			choco3.setDisponible(true);
			
			lista.add(choco1);
			lista.add(choco2);
			lista.add(choco3);
		}catch (Exception e) {
			System.out.println("error: " + e.getMessage());
		}
		return lista;
	}
	
	}
