package ru.sevumyan.arsen.post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostReader {
    public static void main(String[] args){

        String path = "src\\main\\resources\\post.csv";
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            while ((line = bf.readLine()) != null) {
                String[] post = line.split(splitBy);
                System.out.println("Employee position = " + post[0] + ", salary = " + post[1]);
            }

        } catch (IOException e) {
        }
    }
}
