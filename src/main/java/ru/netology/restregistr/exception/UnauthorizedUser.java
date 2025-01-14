package ru.netology.restregistr.exception;


import org.springframework.http.HttpStatus;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(HttpStatus.UNAUTHORIZED + ": " + msg);
    }
}