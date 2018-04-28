package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionnary {
    public static void main(String[] args) {
        Map<String, String> reverse = new HashMap<>();
        reverse.put("Mother", "Mama");
        reverse.put("Father", "Tata");
        System.out.println("Jeśli chcesz ptzryłuamczyć słówko z angielskiego na polski, wpisz je: ");
        Scanner scanner = new Scanner(System.in);
        String answear = scanner.next();

        for (int i = 0; i < reverse.size(); i++) {
            if (reverse.containsKey(answear)) {
                System.out.println(reverse.get(answear));
            }
        }
    }
}