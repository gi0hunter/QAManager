package com.qamanager.domain;

public enum Status {
	
	Ativo("Ativo"),Inativo("Inativo"),Encerrado("Encerrado"),Pendente("Pendente");
	
	private String descricao;
	
	Status(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
