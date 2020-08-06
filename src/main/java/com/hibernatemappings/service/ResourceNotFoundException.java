package com.hibernatemappings.service;

/**
 * @Author: Bal Bahadur Khadka(Roshan)
 * @Date: 8/6/2020
 * @Project Name: demo
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}