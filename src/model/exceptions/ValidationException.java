package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<String, String>();
	//1- campo, 2- msg de erro
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	//exceção pra validar formulário e carregar mensagens de erro do formulário
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
}
