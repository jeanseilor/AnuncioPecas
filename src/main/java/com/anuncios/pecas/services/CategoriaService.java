package com.anuncios.pecas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuncios.pecas.domain.Categoria;
import com.anuncios.pecas.repository.CategoriaRepository;
import com.anuncios.pecas.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	/**
	 * Busca uma categoria a parti do seu ID
	 * @param id
	 * @return retorna a categoria informada a parti do ID
	 */
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}
	
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);		
	}
	
	
}
