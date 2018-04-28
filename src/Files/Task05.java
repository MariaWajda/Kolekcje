package Files;

import java.io.*;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newWord;

        System.out.println("Podaj ścieżkę pliku, z którego słowa chchesz zamieniać: ");
        String path = scanner.next();

        do {

            // odczytywnie, ale czego?? -> jak zrobić odzcytywanie jednego słowa i jeego zamianę
            try {
                FileInputStream fileInputStream = new FileInputStream(path);
                int read; // czytanie każdego znaku pliku
                while ((read = fileInputStream.read()) != -1){
                    System.out.print((char)read); // rzutpwanie na chara
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println("Podaj nowe słowo: ");
            newWord = scanner.next();

            // zapisywanie nowych słów do podanego pliku
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path, true);
                fileOutputStream.write(newWord.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!newWord.equals("exit"));
        System.exit(0);
    }
}
