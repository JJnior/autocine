package net.autocine.cine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.autocine.cine.model.PeliculaModel;
import net.autocine.cine.service.PeliculaService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping(value = "/pelicula")
public class MostrarPelicula {
	@Autowired
	private PeliculaService servicePelicula;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<PeliculaModel> lista = servicePelicula.buscarTodas();
		model.addAttribute("pelicula",lista);
		return "cartelera";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		model.addAttribute("pelicula", new PeliculaModel());
		return "guardarPelicula";
	}
	
	@PostMapping("/save")
	public String guardar(PeliculaModel pelicula, BindingResult result) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
				}
			return "guardarPelicula";
		}
		servicePelicula.guardar(pelicula);
		System.out.println("pelicula: " + pelicula);
		return "redirect:/pelicula/index";
	}
	
	
	@GetMapping("/ver/{id}")
	public String VerPelicula(@PathVariable("id") int IdPelicula, Model model) {
		
		PeliculaModel pelicula = servicePelicula.buscarPorId(IdPelicula);
		
		model.addAttribute("pelicula", pelicula);
		return "infopelicula";
	}
	@InitBinder
	 public void initBinder(WebDataBinder webDataBinder) {
	  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	  webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	 }
}
