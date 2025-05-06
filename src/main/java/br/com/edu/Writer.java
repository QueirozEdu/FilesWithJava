package br.com.edu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Constants {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Afternoon", "Lovely evening"};

        String pathNewFile = APP_NEWFILE_PATH;

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathNewFile))){
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
