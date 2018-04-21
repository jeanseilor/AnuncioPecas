package com.anuncios.pecas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuncios.pecas.domain.Pedido;
import com.anuncios.pecas.repository.PedidoRepository;
import com.anuncios.pecas.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	
	/**
	 * Busca uma categoria a parti do seu ID
	 * @param id
	 * @return retorna o Pedido informada a parti do ID
	 */
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));

	}
	
}
