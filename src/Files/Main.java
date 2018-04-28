package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\folder\\newFile.txt"); // dlaczego to cholerstwo nie działa????????????????????????
            System.out.println(fileInputStream.read());

            int read; // czytanie każdego znaku pliku
            while ((read = fileInputStream.read()) != -1){
                System.out.print((char)read); // rzutpwanie na chara
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileoOutputStream = new FileOutputStream("D:\\folder\\online.txt", true);
            fileoOutputStream.write("Hejo\n ".getBytes()); // zamiana Stringa na bajty

                    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
