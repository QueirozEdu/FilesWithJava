package br.com.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Program implements Constants{

    public static void main(String[] args) {

        File file = new File(APP_FILE_ONE_PATH);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
