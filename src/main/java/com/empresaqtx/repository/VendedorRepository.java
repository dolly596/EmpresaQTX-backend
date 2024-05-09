package com.empresaqtx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresaqtx.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	@Query("SELECT a FROM Vendedor a WHERE a.nome = :nome")
	List<Vendedor> findByNome (@Param("nome") String nome);
}