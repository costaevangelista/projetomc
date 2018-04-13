package br.com.costawebs.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.costawebs.cursomc.domain.Categoria;
import br.com.costawebs.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria find(Long id) {
		Categoria obj = repository.findOne(id);
		return obj;
	}
}