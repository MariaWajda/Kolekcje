package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File ("D:\\folder\\result.txt");
        if (!file.exists()){
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\folder\\result.txt", true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String answear;
        do {
            System.out.println("Podaj ciąg znakow");
            answear = scanner.nextLine();
            try {
                fileOutputStream.write(answear.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!answear.equals("exit"));
    }
}
