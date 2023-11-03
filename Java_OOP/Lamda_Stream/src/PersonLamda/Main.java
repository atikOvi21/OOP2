package PersonLamda;

public class Main {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.friendList.forEach( p -> System.out.println(p));

        System.out.println("-------------------------------------------");

        for (Person p:
                socialNetwork.friendList) {
            System.out.println(p);
        }

        System.out.println("-------------------------------------------");

        System.out.println("Sorted list by age: ");
        socialNetwork.sortFriendList();
//        socialNetwork.friendList.forEach( p -> System.out.println(p));
    }
}
