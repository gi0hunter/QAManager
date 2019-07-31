package com.qamanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qamanager.dao.CasoDao;
import com.qamanager.domain.Caso;

@Service @Transactional(readOnly = false)
public class CasoServiceImpl implements CasoService{
	@Autowired
	private CasoDao dao;

	@Override
	public void save(Caso caso) {
		dao.save(caso);
		
	}

	@Override
	public void update(Caso caso) {
		dao.update(caso);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Caso findById(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Caso> findAll() {
		
		return dao.findAll();
	}

}
