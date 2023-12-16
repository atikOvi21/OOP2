package PersonLamda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialNetwork {
    List<Person> friendList;

    public SocialNetwork(List<Person> friendList) {
        this.friendList = friendList;
    }

    public SocialNetwork() {
        this.friendList = new ArrayList<Person>(){{
            add(new Person("Friend1", LocalDate.of(1968, 5, 17)));
            add(new Person("Friend2", LocalDate.of(1981, 5, 17)));
            add(new Person("Friend3", LocalDate.of(1971, 5, 17)));
            add(new Person("Friend4", LocalDate.of(1991, 5, 17)));
        }};
    }

    public List<Person> sortFriendList(){
        Person[] friendsAsArray = friendList.toArray(new Person[friendList.size()]);
//        Arrays.sort(friendsAsArray, new PersonAgeComparator());
//
//        Arrays.sort(friendsAsArray,
//                (a, b) -> {
//                    return a.getBirthday().compareTo(b.getBirthday());
//                }
//        );
//
        Arrays.sort(friendsAsArray,
                (a, b) -> Person.compareByAge(a, b)
        );

        //Arrays.sort(friendsAsArray, Person::compareByAge);
        return Arrays.asList(friendsAsArray);
    }
}
