package com.company.exception;

public class CustomException {

    public static void readUser() throws UserNotFoundException {
        throw new UserNotFoundException("user not found");
    }

    public static void read(){
        try {
            readUser();
        } catch (UserNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        read();
    }
}
