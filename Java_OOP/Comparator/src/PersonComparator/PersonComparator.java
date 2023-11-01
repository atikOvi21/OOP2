package PersonComparator;

import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<Person>{


    @Override
    public int compare(Person o1, Person o2) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        if(o1.getAge() == o2.getAge()){
            return o1.getName().compareTo(o2.getName());
        }

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
