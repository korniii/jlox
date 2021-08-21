package com.lox;

public class RuntimeError extends RuntimeException {
    final Token token;
    private String message;

    public RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
