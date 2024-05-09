package com.empresaqtx.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.empresaqtx.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
}