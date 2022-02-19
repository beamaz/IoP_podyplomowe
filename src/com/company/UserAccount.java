package com.company;

import java.util.*;

public class UserAccount {
    public int id = 0;
    Date creationDate = new Date();
    User currentUser = null;

    public User createUser() {

        User user = new User();
        id += 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        user.firstName = in.nextLine();
        System.out.println("Podaj nazwisko: ");
        user.lastName = in.nextLine();
        System.out.println("Podaj adres e-mail: ");
        user.email = in.nextLine();
        System.out.println("Podaj numer telefonu komórkowego: ");
        user.phoneNum = in.nextLine();

        this.creationDate = new Date();
        this.currentUser = user;

        System.out.println(id + ". " + user.firstName + " " + user.lastName + " " + creationDate);
        return this.currentUser;
    }
}

