package com.qamanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qamanager.dao.PlanoDao;
import com.qamanager.domain.Plano;

@Service @Transactional(readOnly = false)
public class PlanoServiceImpl implements PlanoService{
	
	@Autowired
	private PlanoDao dao;

	@Override
	public void save(Plano plano) {
		dao.save(plano);
		
	}

	@Override
	public void update(Plano plano) {
		dao.update(plano);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Plano findById(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Plano> findAll() {
		
		return dao.findAll();
	}
	

}
