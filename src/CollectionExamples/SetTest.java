package CollectionExamples;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Oskar");
        stringSet.add("Oskar");
        stringSet.add("Maria");
        stringSet.add("Damian");
        stringSet.add("Oskar");

        for (String name : stringSet){
            System.out.println(name);
        }
        stringSet.add("Kurka");
    }
}
