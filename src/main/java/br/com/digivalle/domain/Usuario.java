package br.com.digivalle.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	@Email
	private String login;
	@Column(nullable = false)
	@Size(min = 6)
	private String senha;
	@NotNull
	private LocalDateTime horaCadastro;
	
	public Usuario() {
	}

	public Usuario(Long id, String login, String senha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.horaCadastro = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	public LocalDateTime getHoraCadastro() {
		return horaCadastro;
	}
}
