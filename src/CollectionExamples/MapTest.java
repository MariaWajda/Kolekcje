package CollectionExamples;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> tasks = new HashMap<>();
        tasks.put("10", "Zrób xyz");
        tasks.put("12", "Zrób xyzxyz");
        tasks.put("15", "Odbierz dzieciaki");

        // iterowanie po kluczach
        for (String s : tasks.keySet()){
            System.out.println(s);
        }
        // iterowanie po wartościach
        for (String s : tasks.values()) {
            System.out.println(s);
        }
        // itereowanie po jednym i drugiem
        for(Map.Entry<String, String> stringStringEntry : tasks.entrySet()){
            System.out.println("Klucz: " + stringStringEntry.getKey() + " wartość: " + stringStringEntry.getValue());
        }
    }
}
