package Tasks;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> results = new HashSet<>();

        while (results.size() < 6){
            results.add(random.nextInt(7-1)+1);
        }

        for (Integer i: results){
            System.out.println(i);
        }
    }
}
