package com.company;

import java.util.*;

public class UserAccount {
    public int id = 0;
    public Date creationDate = new Date();

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

        System.out.println(id + ". " + user.firstName + " " + user.lastName + " " + creationDate);
        return user;
    }

    public User setUserType() {
        return null;
    }

    public void setPassword() {

    }

    public User user;
}

