package br.ufc.concurso.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ProfessorOrientador {
	private int idOrientador;
	private String nomeOrientador;
	private String linhaPesquisa;

	public int getIdOrientador() {
		return idOrientador;
	}

	public void setIdOrientador(int idOrientador) {
		this.idOrientador = idOrientador;
	}

	public String getNomeOrientador() {
		return nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

	public String getLinhaPesquisa() {
		return linhaPesquisa;
	}

	public void setLinhaPesquisa(String linhaPesquisa) {
		this.linhaPesquisa = linhaPesquisa;
	}

}
