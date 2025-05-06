package br.com.edu;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;
public class Program implements Constants{

    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(APP_FILEONE_PATH))) {

                String line = bufferedReader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }