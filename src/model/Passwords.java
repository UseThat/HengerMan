package model;

import java.util.ArrayList;

public class Passwords {
    private ArrayList <String> passwords;

    public Passwords(ArrayList <String> passwords){
        this.passwords = passwords;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(ArrayList<String> passwords) {
        this.passwords = passwords;
    }
}
