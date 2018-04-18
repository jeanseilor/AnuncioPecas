package com.anuncios.pecas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anuncios.pecas.domain.Categoria;
import com.anuncios.pecas.repository.CategoriaRepository;

@SpringBootApplication
public class AnuncioPecasApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AnuncioPecasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}
}
