package com.joselemes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joselemes.cursomc.domain.Categoria;
import com.joselemes.cursomc.repositories.CategoriaRepository;
import com.joselemes.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
//	public Categoria buscar(Integer id) {
//		Categoria obj = repo.getOne(id);
//		return obj;
//	}
	
	//Spring 2.2
//	public Categoria buscar(Integer id) {
//		Optional<Categoria> obj = repo.findById(id);
//		return obj.orElse(null);
//	}
	
	//Tratando erro
//	public Categoria find(Integer id) {
//		Categoria obj = repo.findOne(id);
//		if (obj == null) {
//		throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
//		+ ", Tipo: " + Categoria.class.getName());
//		}
//		return obj;
//	}
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);		
		String errMsg = "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName();
		return obj.orElseThrow(() -> new ObjectNotFoundException(errMsg));
	}
}
