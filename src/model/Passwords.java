package model;

import java.util.ArrayList;

public class Passwords {
    private ArrayList <String> passwords;


    public Passwords(){
        passwords = new ArrayList<>();
    }

    public String getPasswords(int index) {
        return passwords.get(index);
    }

    public void setPasswords(String password) {
        passwords.add(password);
    }
}
