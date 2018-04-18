package com.anuncios.pecas.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anuncios.pecas.domain.Categoria;

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> Listar() {
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Informatica");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
}
