package br.com.edu;

import java.io.File;
import java.util.Scanner;

public class ListFilesAndFolders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String strPath = scanner.nextLine();
            File path = new File(strPath);

            File[] folders = path.listFiles(File::isDirectory);
            for (File folder : folders) {
                System.out.println(folder);
            }
            File[] files = path.listFiles(File::isFile);
            for (File file : files) {
                System.out.println(file);
            }
            scanner.close();
        }
        catch (NullPointerException e) {
            System.out.println("Error: Path doest not exist.");
        }
    }
}
