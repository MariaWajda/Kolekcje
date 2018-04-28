package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maja", "Kaja", "Oskra", "Tomek", "Tadek", "Karolina");

        String name = "Tomek";
        Optional<String> stringOptional = Optional.ofNullable(name);

        System.out.println("Zmodyfikowaneeeeee");

//        if(stringOptional.ifPresent()){
//            System.out.println(stringOptional.get());
//        } else {
//            System.out.println("Imie nie istnieje");
//        }

        //kolejny update

        System.out.println("Witaj w akademikodu");
        while (true) {
            System.out.println("AKADEMIA JEST NAJLEPSZA!");
        }
    }
}
