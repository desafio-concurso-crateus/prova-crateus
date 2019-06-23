package br.ufc.concurso.entity;

import java.io.File;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidato {
	@Id
	private String cpf;
	private String nome;
	private String email;
	private String sexo;
	private Date dataNascimento;
	@Column(columnDefinition = "blob")
	private File curriculumVitae;
	@Embedded
	private ProfessorOrientador orientador;

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public File getCurriculumVitae() {
		return curriculumVitae;
	}

	public void setCurriculumVitae(File curriculumVitae) {
		this.curriculumVitae = curriculumVitae;
	}

	public ProfessorOrientador getOrientador() {
		return orientador;
	}

	public void setOrientador(ProfessorOrientador orientador) {
		this.orientador = orientador;
	}

	public boolean cpfIsValid() {
		return (this.getCpf() != null && this.getCpf().length() == 11
				&& this.getCpf().matches("/^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}/")) ? true : false;

	}

	public boolean nomeValido() {
		return (this.getNome() != null && (this.getNome().length() >= 3 && this.getNome().length() <= 60)) ? true
				: false;
	}

	public boolean emailValido() {
		return (this.getEmail() != null && !this.getEmail().equals("")) ? true : false;
	}

	public boolean sexoValido() {
		return (this.getSexo() != null && !this.getSexo().equals("")) ? true : false;
	}

	public boolean nascimentoValido() {
		Date menor = new Date(1970, 0, 1);
		Date maior = new Date(2001, 0, 1);
		return (this.getDataNascimento() != null && this.getDataNascimento().before(maior)
				&& this.getDataNascimento().after(menor)) ? true : false;
	}

	public boolean curriculumValido() {
		return (this.getCurriculumVitae() != null && !this.getCurriculumVitae().equals("")) ? true : false;
	}

	public boolean orientadorValido() {
		return (this.getOrientador() != null && this.getOrientador().getIdOrientador() != 0) ? true : false;
	}

	public boolean isValid() {
		return (this.cpfIsValid() && this.nomeValido() && this.emailValido() && this.sexoValido()
				&& this.nascimentoValido() && this.curriculumValido() && this.orientadorValido()) ? true : false;
	}

}
