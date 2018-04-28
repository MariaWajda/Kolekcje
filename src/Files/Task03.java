package Files;

import java.io.FileInputStream;
import java.io.IOException;

public class Task03 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("D:\\folder\\akademia.kodu.txt");

            int read;
            while ((read = file.read()) != -1){
                System.out.print((char) read);
            } file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
