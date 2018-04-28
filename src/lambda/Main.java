package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.addAll(Arrays.asList("Oskar", "Damian", "Ada", "Tomek", "Dorota"));
//
//        names.sort((s, s1) -> s.compareTo(s1) * -1);
//        names.forEach(System.out::println);
//
//        Nameator nameator =  s -> s.toUpperCase();
//        Nameator nameator1 = s -> s.toLowerCase();
//
//        System.out.println(nameator1.getName("KAMIL"));

        showMe(s -> s.toLowerCase(), "HELLO!");
        showMe(s -> s.toUpperCase(), "hello");
        showMe(s -> s.concat(" - to doklejka z lambdy hehe"), "hejo");
        showMe(s -> String.valueOf(s.charAt(0)), "eloeloo320");
        showMe(s -> s.replaceAll("i", ""), "Oi KiUiRiWiAi");
        showMe(a -> a.concat(" yeah"), "Fuck");
        showMe(text -> text.substring(2, 5), "absztyfikant");
        showMore(s -> s.substring(0, 4), "Chlibka");

    }
    public static void showMore (Function <String , String> function, String name){
        System.out.println(function.apply(name));
    }

    public static void showMe (Nameator nameator, String s){
        System.out.println(nameator.getName(s));
    }
}
