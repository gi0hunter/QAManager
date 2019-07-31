package com.qamanager.dao;

import java.util.List;

import com.qamanager.domain.Usuario;

public interface UsuarioDao {
	
	void save(Usuario usuario);

    void update(Usuario usuario);

    void delete(Long id);

    Usuario findById(Long id);

    List<Usuario> findAll();

}
