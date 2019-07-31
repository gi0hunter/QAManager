package com.qamanager.dao;

import java.util.List;

import com.qamanager.domain.Plano;

public interface PlanoDao {
	void save(Plano plano);

    void update(Plano plano);

    void delete(Long id);

    Plano findById(Long id);

    List<Plano> findAll();


}
