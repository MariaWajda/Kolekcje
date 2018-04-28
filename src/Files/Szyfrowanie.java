package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Szyfrowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answear;
        do {
            System.out.print("Podaj słowo: ");
            answear = scanner.nextLine();
            addToFile(hash(answear));
        } while (!answear.equals("exit"));
    }
    private static void addToFile (String text){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\folder\\online.txt");
            fileOutputStream.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String hash (String text){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append((char) (text.charAt(i) + 23)).append((text.charAt(text.length()-1)));
        } return stringBuilder.toString();
    }
}
