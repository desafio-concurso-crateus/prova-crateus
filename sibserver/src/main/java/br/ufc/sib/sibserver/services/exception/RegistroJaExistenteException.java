package br.ufc.sib.sibserver.services.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class RegistroJaExistenteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegistroJaExistenteException(String campo, String valor) {
		super("Registro com "+campo+" = "+valor+" já existe");
	}

}
