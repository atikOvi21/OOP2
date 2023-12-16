public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        MyList<Person> list = new MyList<>();
        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        System.out.println(list.contains(p1));
        System.out.println(list.contains(p2));
        System.out.println(list.contains(p3));

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        System.out.println(list.contains(s1));
        System.out.println(list.contains(s2));
    }
}