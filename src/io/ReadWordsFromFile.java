package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWordsFromFile {
    private static String FILE_NAME = "passwords.txt";
    private BufferedReader bufferedReader;
    private ArrayList<String> passwordsList;

    public ArrayList<String> fileRead() throws IOException {
        String readFile = "";
        passwordsList = new ArrayList<>();
        try{
            bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
            while((readFile = bufferedReader.readLine()) != null){
                passwordsList.add(readFile);
            }
        }catch(IOException ex){
            System.out.println("Problem with file read");
        }

        System.out.println(passwordsList.toString());

        return passwordsList;
    }

}
