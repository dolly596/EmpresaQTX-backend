package com.empresaqtx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresaqtx.entities.Produto;
import com.empresaqtx.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository ProdutoRepository;

	@Autowired
	public ProdutoService(ProdutoRepository ProdutoRepository) {
		this.ProdutoRepository = ProdutoRepository;
	}

	public List<Produto> buscaTodosProduto(){
		return ProdutoRepository.findAll();
	}
	//@query
	public List<Produto> findByNome(String nome) {
		return ProdutoRepository.findByNome(nome);
	}
	public Produto buscaProdutoId (Long id) {
		Optional <Produto> Produto = ProdutoRepository.findById(id);
		return Produto.orElse(null);			
	}
	
	
		
	public Produto salvaProduto(Produto Produto) {
		return ProdutoRepository.save(Produto);
	}
	
	public Produto alterarProduto(Long id, Produto alterarProduto) {
		Optional <Produto> existeProduto = ProdutoRepository.findById(id);
		if (existeProduto.isPresent()) {
			alterarProduto.setId(id);
			return ProdutoRepository.save(alterarProduto);
		}
		return null;
	}

	public boolean apagarProduto(Long id) {
		Optional <Produto> existeProduto = ProdutoRepository.findById(id);
		if (existeProduto.isPresent()) {
			ProdutoRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
}