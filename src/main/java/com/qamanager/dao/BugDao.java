package com.qamanager.dao;

import java.util.List;

import com.qamanager.domain.Bug;

public interface BugDao {
	void save(Bug bug);

    void update(Bug bug);

    void delete(Long id);

    Bug findById(Long id);

    List<Bug> findAll();

}
