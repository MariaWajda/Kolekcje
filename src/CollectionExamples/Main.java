package CollectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Maria");
        names.add("Oskra");
        names.add("Paweł");
        names.add("Adam");

        names.remove("Adam");

        for (String name: names) {
            System.out.println(name);
        }

        Node <String> node4 = new Node<>();

        Node<String> node = new Node<>();
        node.value = "Ala";

        Node<String> node1 = new Node<>();
        node1.value = "Inna wartość";

        List<Integer> ages = new LinkedList<>();
        ages.add(20);
        ages.add(30);
        ages.add(40);

        for(Integer age : ages){
            System.out.println(age);
        }
    }
}
