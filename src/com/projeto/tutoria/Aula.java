package com.projeto.tutoria;

public class Aula {
	private String descri��o;
	private String IdAula;

	public Aula(String descri��o, String idAula) {
		super();
		this.descri��o = descri��o;
		IdAula = idAula;
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
