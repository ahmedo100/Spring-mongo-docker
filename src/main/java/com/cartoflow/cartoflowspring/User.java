package com.cartoflow.cartoflowspring;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String idUser;
    private String firstName;
    private String lastName;

    public User(){}

    public User(final String firstName, final String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("[User:%s ,Born:%s]", firstName, lastName);
    }
}