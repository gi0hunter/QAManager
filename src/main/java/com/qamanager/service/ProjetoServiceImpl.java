package com.qamanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qamanager.dao.ProjetoDao;
import com.qamanager.domain.Projeto;

@Service @Transactional(readOnly = false)
public class ProjetoServiceImpl implements ProjetoService{
	
	@Autowired
	private ProjetoDao dao;
	private PlanoService planos;

	@Override
	public void save(Projeto projeto) {
		dao.save(projeto);
		
	}

	@Override
	public void update(Projeto projeto) {
		dao.update(projeto);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Projeto findById(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Projeto> findAll() {
		
		return dao.findAll();
	}

	@Override
	public boolean projetoTemPlanos(Long id) {
		if(findById(id).getPlanos().isEmpty())
		{
			return false;
			
		}
		else {
			return true;
		}
	}

}
