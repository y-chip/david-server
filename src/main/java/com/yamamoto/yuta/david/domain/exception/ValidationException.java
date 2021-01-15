package com.yamamoto.yuta.david.domain.exception;

public class ValidationException extends RuntimeException {

    public ValidationException(String field, String message) {
        super(message);
        this.field = field;
    }

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
