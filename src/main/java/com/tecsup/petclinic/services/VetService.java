package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.exception.VetNotFoundException;

/**
 * 
 * @author jgomezm
 *
 */
public interface VetService {
	
	

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Vet create(Vet vet);

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Vet update(Vet vet);

	/**
	 * 
	 * @param id
	 * @throws VetNotFoundException
	 */
	void delete(Integer id) throws VetNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	Vet findById(Integer id) throws VetNotFoundException;

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Vet> findByName(String name);

	/**
	 * 
	 * @param lastName
	 * @return
	 */
	List<Vet> findByLastname(String lastname);

	/**
	 *
	 * @return
	 */
	List<Vet> findAll();
}