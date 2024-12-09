package com.anabelenhernandez.despensainteligente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anabelenhernandez.despensainteligente.model.Usuario;

// Cambia "class" por "interface" y extiende JpaRepository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
