package com.projeto.negocios;

import com.projeto.exception.ExcecaoIllegalArgumentException;

public class Aula {
	private String descri��o;
	private String IdAula;

	public Aula(String descri��o, String idAula) {
		super();
		this.descri��o = descri��o;
		IdAula = idAula;
		if (descri��o == null && idAula == null) {
			throw new ExcecaoIllegalArgumentException("Aula n�o pode ser Nulo");
		}
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public String getIdAula() {
		return IdAula;
	}

	public void setIdAula(String idAula) {
		IdAula = idAula;
	}

}
