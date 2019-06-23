package br.ufc.fortaleza.concurso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue
	private long id;
	private String cpf;
	private String nome;
	private String email;
	private String sexo;
	private String dataDeNascimento;
	private Object professorOrientador;
	private Object curriculo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Object getProfessorOrientador() {
		return professorOrientador;
	}
	public void setProfessorOrientador(Object professorOrientador) {
		this.professorOrientador = professorOrientador;
	}
	public Object getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(Object curriculo) {
		this.curriculo = curriculo;
	}
}

