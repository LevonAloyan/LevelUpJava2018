package com.company.algorithms;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        User levon = new User("Levon",24);
        User gagik = new User("Gagik",22);
        User vahe = new User("Vahe",38);
        User aram = new User("Aram",20);
        User ashot = new User("Ashot",28);
        User ash= new User("Ash",21);

        Set<User> users = new TreeSet<>();
        users.add(levon);
        users.add(gagik);
        users.add(vahe);
        users.add(aram);
        users.add(ashot);
        users.add(ash);

        for (User user : users){
            System.out.println(user);
        }


    }

}
