package com.qamanager.service;

import java.util.List;

import com.qamanager.domain.Projeto;

public interface ProjetoService {
	
	void save(Projeto projeto);

    void update(Projeto projeto);

    void delete(Long id);

    Projeto findById(Long id);

    List<Projeto> findAll();

	boolean projetoTemPlanos(Long id);


}
