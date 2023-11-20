package PersonLamda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.friendList.forEach( p -> System.out.println(p));

        System.out.println("-------------------------------------------");

        System.out.println("Sorted list by age: ");
        List<Person> sortedList = socialNetwork.sortFriendList();
        sortedList.forEach( p -> System.out.println(p));
    }
}
