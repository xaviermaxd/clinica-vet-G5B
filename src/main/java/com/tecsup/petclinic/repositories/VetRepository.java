package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.petclinic.entities.Vet;

public interface VetRepository extends CrudRepository<Vet, Integer> {
	
	//listado por apellido
	List<Vet> findbyLastname(String lastname);
	
	//Listado por nombre
	List<Vet> findByName(String name);
	
	
	//Lista de todos los veterinarios
	
	@Override
	List<Vet> findAll();
	
}
