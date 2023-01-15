package me.vik.socksapp.exception;

public class InvalidSockRequestException extends RuntimeException {
    public InvalidSockRequestException(String message) {
        super(message);
    }
}