package br.ufc.sib.sibserver.services.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class CampoInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CampoInvalidoException(String campo, String valor) {

		super("O campo " + campo + " está incorreto (" + valor + ")");
		// TODO Auto-generated constructor stub
	}

}
