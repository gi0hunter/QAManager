package com.qamanager.service;

import java.util.List;

import com.qamanager.domain.Bug;

public interface BugService {
	
	void save(Bug bug);

    void update(Bug bug);

    void delete(Long id);

    Bug findById(Long id);

    List<Bug> findAll();

}
