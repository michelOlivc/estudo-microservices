package com.estudo.inventory.errors.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityName, String id) {
        super(String.format("Entity %s not found with ID %s", entityName, id));
    }
}
