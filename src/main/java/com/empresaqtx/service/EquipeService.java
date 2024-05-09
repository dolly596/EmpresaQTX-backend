package com.empresaqtx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresaqtx.entities.Equipe;
import com.empresaqtx.repository.EquipeRepository;

@Service
public class EquipeService {
	
	private final EquipeRepository EquipeRepository;

	@Autowired
	public EquipeService(EquipeRepository EquipeRepository) {
		this.EquipeRepository = EquipeRepository;
	}

	public List<Equipe> buscaTodosEquipe(){
		return EquipeRepository.findAll();
	}
	//@query
	public List<Equipe> findByNome(String nome) {
		return EquipeRepository.findByNome(nome);
	}
	public Equipe buscaEquipeId (Long id) {
		Optional <Equipe> Equipe = EquipeRepository.findById(id);
		return Equipe.orElse(null);			
	}
	
	
		
	public Equipe salvaEquipe(Equipe Equipe) {
		return EquipeRepository.save(Equipe);
	}
	
	public Equipe alterarEquipe(Long id, Equipe alterarEquipe) {
		Optional <Equipe> existeEquipe = EquipeRepository.findById(id);
		if (existeEquipe.isPresent()) {
			alterarEquipe.setId(id);
			return EquipeRepository.save(alterarEquipe);
		}
		return null;
	}

	public boolean apagarEquipe(Long id) {
		Optional <Equipe> existeEquipe = EquipeRepository.findById(id);
		if (existeEquipe.isPresent()) {
			EquipeRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
}