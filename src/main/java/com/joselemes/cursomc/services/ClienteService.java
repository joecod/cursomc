package com.joselemes.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joselemes.cursomc.domain.Cliente;
import com.joselemes.cursomc.repositories.ClienteRepository;
import com.joselemes.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);		
		String errMsg = "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName();
		return obj.orElseThrow(() -> new ObjectNotFoundException(errMsg));
	}
}
