package net.autocine.cine.service;

import java.util.List;

import net.autocine.cine.model.PeliculaModel;

public interface PeliculaService {
	List<PeliculaModel> buscarTodas();
	PeliculaModel buscarPorId(Integer IdPelicula);
	void guardar(PeliculaModel pelicula);
}
