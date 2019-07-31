package com.qamanager.domain;

public enum Perfil {
	Master("Master"), Operador("Operador"), Administrador("Administrador");

	private String perfil_user;

	Perfil(String perfil_user) {
		this.perfil_user = perfil_user;
	}

	public String getPerfil_user() {
		return perfil_user;
	}

}
