package Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answear;
        String path;
        File file;
        do {
            System.out.println("Wybierz, co chcesz zrobić: ");
            System.out.println("1 - utwórz plik \n2 - utwórz katalolg \nexit - zakończ program");
            answear = scanner.next();

            switch (answear) {
                case "1": {
                    System.out.println("Podaj ścieżkę dla miejsca utworzenia pliku: ");
                    path = scanner.next();
                    file = new File(path);
                    try {
                        System.out.println("Udało się stworzyć plik: " + file.createNewFile());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "2": {
                    System.out.println("Podaj miejsce utworzenia nowego katalogu");
                    path = scanner.next();
                    file = new File(path);
                    System.out.println("Udało się utwrzyć nowy folder: " + file.mkdir()); // dlaczego nowy folder nie chce się utworzyć?
                    break;
                }
            }
        } while (!answear.equals("exit"));
    }
}
