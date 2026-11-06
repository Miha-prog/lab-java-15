package org.example;

public class PetNotFoundException extends Exception {
    public PetNotFoundException(String message) {
        super(message);
    }
}