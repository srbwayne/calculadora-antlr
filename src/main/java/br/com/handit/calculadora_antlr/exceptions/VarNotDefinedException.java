package br.com.handit.calculadora_antlr.exceptions;

public class VarNotDefinedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VarNotDefinedException() {
		super();
	}

	public VarNotDefinedException(String msg) {
		super(msg);
	}

	public VarNotDefinedException(String message, Throwable cause) {
		super(message, cause);
	}

}