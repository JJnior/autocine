package net.autocine.cine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import net.autocine.cine.model.PeliculaModel;

//public interface PeliculaRepository extends CrudRepository<PeliculaModel, Integer> {
public interface PeliculaRepository extends JpaRepository<PeliculaModel, Integer> {

}
