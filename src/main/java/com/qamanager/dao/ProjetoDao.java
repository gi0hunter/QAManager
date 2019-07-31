package com.qamanager.dao;

import java.util.List;

import com.qamanager.domain.Projeto;

public interface ProjetoDao {
	void save(Projeto projeto);

    void update(Projeto projeto);

    void delete(Long id);

    Projeto findById(Long id);

    List<Projeto> findAll();


}
