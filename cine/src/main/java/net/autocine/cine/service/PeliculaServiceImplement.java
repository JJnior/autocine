package net.autocine.cine.service;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import net.autocine.cine.model.PeliculaModel;

@Service
public class PeliculaServiceImplement implements PeliculaService{
	private List<PeliculaModel> lista = null;
	
	public PeliculaServiceImplement() {
		lista = new LinkedList<PeliculaModel>();
		try {
			PeliculaModel pelicula1 = new PeliculaModel();
			pelicula1.setId(1);
			pelicula1.setRuta("/image/the batman.jpg");
			pelicula1.setNombre("The Batman");
			pelicula1.setDescripcion("En su segundo año luchando contra el crimen, Batman explora la corrupción existente en la ciudad de Gotham y el vínculo de esta con su propia familia. Además, entrará en conflicto con un asesino en serie conocido como \"el Acertijo\".");
			pelicula1.setDuracion(180);
			pelicula1.setPrecio(25.0);
			pelicula1.setCategoria("accion");
			
			PeliculaModel pelicula2 = new PeliculaModel();
			pelicula2.setId(2);
			pelicula2.setRuta("/image/terrifier.jpg");
			pelicula2.setNombre("Terrifier 3");
			pelicula2.setDescripcion("Terrifier 3 es una planeada cinta de horror, dirigida nuevamente por Damien Leone, cuya trama aun no se conoce, dado su etapa de preproducción, pero seguirá el camino sangriento del temible Art the Clown, quien, tras haber sido resucitado tras la masacre en Miles County, ha regresado para seguir cobrando víctimas en la noche de Halloween.");
			pelicula2.setDuracion(180);
			pelicula2.setPrecio(25.0);
			pelicula2.setCategoria("terror");
			
			PeliculaModel pelicula3 = new PeliculaModel();
			pelicula3.setId(3);
			pelicula3.setRuta("/image/beetlejuice.jpg");
			pelicula3.setNombre("Beetlejuice");
			pelicula3.setDescripcion("Un matrimonio de fantasmas contrata a Bitelchús, un especialista en asustar mortales, para que ahuyente a los nuevos propietarios de su casa.");
			pelicula3.setDuracion(120);
			pelicula3.setPrecio(25.0);
			pelicula3.setCategoria("Comedia");
			
			PeliculaModel pelicula4 = new PeliculaModel();
			pelicula4.setId(4);
			pelicula4.setRuta("/image/coraline.jpg");
			pelicula4.setNombre("Coraline");
			pelicula4.setDescripcion("Una niña descubre una puerta secreta en su nueva casa y entra a una realidad alterna que la refleja fielmente de muchas formas.");
			pelicula4.setDuracion(110);
			pelicula4.setPrecio(30.0);
			pelicula4.setCategoria("Suspenso");
			
			PeliculaModel pelicula5 = new PeliculaModel();
			pelicula5.setId(5);
			pelicula5.setRuta("/image/robot salvaje.jpg");
			pelicula5.setNombre("Robot Salvaje");
			pelicula5.setDescripcion("Un robot llamado Roz naufraga en una isla, donde debe aprender a adaptarse a su nuevo entorno, al establecer relaciones con los animales del lugar, pronto desarrolla un vínculo paternal con un ganso huérfano.");
			pelicula5.setDuracion(120);
			pelicula5.setPrecio(30.0);
			pelicula5.setCategoria("Animación");
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			lista.add(pelicula4);
			lista.add(pelicula5);
		}catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}
	}
	@Override
	public List<PeliculaModel> buscarTodas(){
		return lista;
	}
	@Override
	public PeliculaModel buscarPorId(Integer IdPelicula) {
		for (PeliculaModel p: lista) {
			if(p.getId()==IdPelicula) {
				return p;
			}
		}
		return null;
	}
	@Override
	public void guardar(PeliculaModel pelicula) {
		lista.add(pelicula);		
	}

}
