package com.anuncios.pecas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuncios.pecas.domain.Cliente;
import com.anuncios.pecas.repository.ClienteRepository;
import com.anuncios.pecas.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	
	/**
	 * Busca uma categoria a parti do seu ID
	 * @param id
	 * @return retorna o cliente informada a parti do ID
	 */
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}
	
}
