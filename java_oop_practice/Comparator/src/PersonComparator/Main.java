package PersonComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20));
        people.add(new Person("Steve", 30));
        people.add(new Person("Samantha", 25));
        people.add(new Person("Jane", 20));

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Comparator<Person> personComparator = new PersonComparator();
        people.sort(personComparator);
        System.out.println("After sorting:");

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
