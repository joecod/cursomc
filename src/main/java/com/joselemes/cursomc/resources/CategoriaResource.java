package com.joselemes.cursomc.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joselemes.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cad1 = new Categoria(1, "Informática");		
		Categoria cad2 = new Categoria(2, "Escritório");		
		
		List<Categoria> lista = new ArrayList<>();		
		lista.add(cad1);
		lista.add(cad2);
		
		return lista;
	}
}
