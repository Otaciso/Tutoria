package com.projeto.Exception;

@SuppressWarnings("serial")
public class ArquivoInexistenteException extends RuntimeException {

	public ArquivoInexistenteException(String msn) {
		super(msn);
	}
}