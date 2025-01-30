package com.firatcanyanan.exception;

//Bad Request: 404
public class NotFound404Exception extends RuntimeException{
    public NotFound404Exception(String message) {
        super(message);
    }
}
