package Exceptions;

import javax.swing.*;
import java.io.IOException;

public class ExcTest {
    public static void main(String[] args) {
        try {
            play();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Przykro mi, nasze serwery sa niedostępne");
        }
    }
    public static void play () throws IOException {
        divide(5, 0);
    }
    public static int divide (int a, int b) throws IOException{
        if (b ==0) {
            throw new IOException("Do not devode by 0");
        }
        return a/b;
    }
}
