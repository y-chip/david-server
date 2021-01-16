package com.yamamoto.yuta.david.application.resource;

import io.swagger.v3.oas.annotations.media.Schema;

public class ValidationError {

    public ValidationError(String field, String message) {
        this.field = field;
        this.message = message;
    }

    @Schema(required = true, nullable = true)
    private String field;

    @Schema(required = true, nullable = true)
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
