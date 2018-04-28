package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class MyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2, 3, 23, 5, 6, 7));
        System.out.println(map(elements, s -> s + 5));

    }
    public static List<Integer> map (List <Integer> list, IntUnaryOperator operator){
        List <Integer> newList = new ArrayList<>();
        for (Integer t : list) {
            newList.add(operator.applyAsInt(t));
        }
        return newList;
    }
}
