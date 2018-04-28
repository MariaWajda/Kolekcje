package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task01 {
    public static void main(String[] args) {
//        File file = new File ("D:\\folder\\newFile.txt");
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File ("D:\\folder\\pasta.mojeRoz.txt");
        System.out.println(file.exists());

    }
}
