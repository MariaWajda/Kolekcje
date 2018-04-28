package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maja", "Kaja", "Oskar", "Tomek", "Tadek", "Karolina");

        System.out.println(list.parallelStream()
                .filter(s -> !s.endsWith("a"))
                .sorted()
                .distinct()
                .limit(2)
               // .mapToInt(s-> s.length())
                //.reduce((s, s1) -> s1 + s)
               // .sum()
                //.collect(Collectors.joining(", "), "Imiona", ".")
                );

        //IntStream.range(0, 200).forEach(s -> System.out.println(s));
       System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).summaryStatistics().andThen((s)-> System.out.println(s)));

       IntStream.range(0, 100)
               .filter(s -> s%2!=0)
               .mapToObj(String::valueOf)
               .forEach(System.out::println);

    }
}
