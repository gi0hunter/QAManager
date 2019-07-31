package com.qamanager.service;

import java.util.List;

import com.qamanager.domain.Plano;

public interface PlanoService {
	void save(Plano plano);

    void update(Plano plano);

    void delete(Long id);

    Plano findById(Long id);

    List<Plano> findAll();

}
