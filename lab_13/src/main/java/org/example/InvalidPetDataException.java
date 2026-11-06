package org.example;

public class InvalidPetDataException extends Exception {
    public InvalidPetDataException(String message) {
        super(message);
    }
}