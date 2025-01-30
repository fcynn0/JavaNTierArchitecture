package com.firatcanyanan.exception;

//Bad Request: 400
public class BadRequest400Exception extends RuntimeException{
    public BadRequest400Exception(String message) {
        super(message);
    }
}
