package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Appearances {
    public static void main(String[] args) {
        int [] numbers = new int [] {1, 2, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i : numbers) {
            if (counts.containsKey(i)) {
                counts.put(i, counts.get(i) + 1);
            } else {
                counts.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : counts.entrySet()){
            System.out.println("Liczba " + integerIntegerEntry.getKey() + " ma " + integerIntegerEntry.getValue() + " wystąpień");
        }

    }
}
