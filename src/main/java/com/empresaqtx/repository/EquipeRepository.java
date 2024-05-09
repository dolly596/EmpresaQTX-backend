package com.empresaqtx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresaqtx.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	@Query("SELECT a FROM Equipe a WHERE a.nome = :nome")
	List<Equipe> findByNome (@Param("nome") String nome);
}