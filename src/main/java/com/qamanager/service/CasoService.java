package com.qamanager.service;

import java.util.List;

import com.qamanager.domain.Caso;

public interface CasoService {
	void save(Caso caso);

    void update(Caso caso);

    void delete(Long id);

    Caso findById(Long id);

    List<Caso> findAll();

}
