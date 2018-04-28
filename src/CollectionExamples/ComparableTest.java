package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Person person1 = new Person("Damian", 24);
        Person person2 = new Person("Maria", 21);
        Person person3 = new Person("Damian", 30);
        Person person4 = new Person("Nikodem", 21);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Collections.sort(personList, new WeirdSort()); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        for (Person x : personList){
            System.out.println(x.getName() + " " + x.getAge());
        }
    }
    public static class AgeSort implements Comparator<Person>{
        @Override
        public int compare (Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge()) * -1;
        }
    }
    public static class NameSort implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2){
            return o1.getName().compareTo(o2.getName()) * -1;
        }
    }
    public static class WeirdSort implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2){
            if (o1.getAge() > 22) {
                return o1.getName().compareTo(o2.getName());
            } else return Integer.compare(o1.getAge(), o2.getAge()) * -1;
        }
    }
}
