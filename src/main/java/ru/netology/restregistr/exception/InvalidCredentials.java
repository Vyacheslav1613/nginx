package ru.netology.restregistr.exception;

import org.springframework.http.HttpStatus;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(HttpStatus.BAD_REQUEST + ": " + msg);
    }
}