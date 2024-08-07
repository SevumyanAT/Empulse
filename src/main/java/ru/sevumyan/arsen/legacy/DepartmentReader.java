package ru.sevumyan.arsen.legacy;

import java.io.File;
import java.util.Scanner;

public class DepartmentReader {
    public static void main(String[] args) throws Exception {
        String path = "src\\main\\resources\\Department.csv";
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",");

        while (sc.hasNext()) {

            System.out.print(sc.next());
        }

        sc.close();
    }

}
