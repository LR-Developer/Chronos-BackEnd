package br.com.chronos.utils.exceptions;

import java.util.List;

public class BadRequestException extends RuntimeException {

	private MessageErrorResponse errorResponse;

	public MessageErrorResponse getErrorResponse() {
		return this.errorResponse;
	}
	
	public BadRequestException() {
		super("Bad Request!");
	}
	
	public BadRequestException(String mensagem) {
		super(mensagem);
	}
	
	public BadRequestException(List<MessageErrorDetail> errors) {
		this.errorResponse = new MessageErrorResponse("Erros ao salvar!", errors);
	}

}
