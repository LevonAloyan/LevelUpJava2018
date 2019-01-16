package com.company.exception.customexcetion;

public class UseCustomException {

    public static void main(String[] args) {
        if (1 < 30) {
            throw new UserNotFoundException("user with given id not found");
        }
    }
}
