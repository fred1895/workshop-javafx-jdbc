package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValidationException (String str) {
		super(str);
	}
	
	Map<String, String> erros = new HashMap<>();

	public Map<String, String> getErros() {
		return erros;
	}
	
	public void addError(String fieldName, String errorMessage) {
		erros.put(fieldName, errorMessage);
	}
}
