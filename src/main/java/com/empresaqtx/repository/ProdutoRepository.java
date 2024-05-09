package com.empresaqtx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresaqtx.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	@Query("SELECT a FROM Produto a WHERE a.nome = :nome")
	List<Produto> findByNome (@Param("nome") String nome);
}