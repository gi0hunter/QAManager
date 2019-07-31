package com.qamanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qamanager.dao.BugDao;
import com.qamanager.domain.Bug;

@Service 
@Transactional(readOnly = false)
public class BugServiceImpl implements BugService{
	
	@Autowired
	private BugDao dao;
	

	@Override
	public void save(Bug bug) {
		dao.save(bug);
		
	}

	@Override
	public void update(Bug bug) {
		dao.update(bug);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Bug findById(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Bug> findAll() {
		
		return dao.findAll();
	}

}
