package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usuarios;

public interface UsuarioDao extends JpaRepository<Usuarios, Long> {
    

}
