package PersonLamda;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    public int age;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        age = getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate currentDay = LocalDate.now();
        return Period.between(birthday, currentDay).getYears();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getYear() +
                '}';
    }
}
