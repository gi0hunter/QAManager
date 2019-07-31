package com.qamanager.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@Column(name = "email", nullable = false, unique = true, length = 60)
	private String email;

	@Column(nullable = false, length = 16)
	@Enumerated(EnumType.STRING)
	private Perfil perfil_user;

	@Column(name = "status", nullable = false, length = 60)
	@Enumerated(EnumType.STRING)
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil_user() {
		return perfil_user;
	}

	public void setPerfil_user(Perfil perfil_user) {
		this.perfil_user = perfil_user;
	}

}
