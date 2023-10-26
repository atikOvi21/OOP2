import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    MyList<Person> list = new MyList<>();

    @Test
    public void testContains() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        assertTrue(list.contains(p1));
        assertTrue(list.contains(p2));
        assertTrue(list.contains(p3));

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        assertTrue(list.contains(s1));
        assertTrue(list.contains(s2));
    }

    @Test
    public void testRemoveItem() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        Person removedPerson = list.removeItem(0);

        assertTrue(removedPerson.equals(p1));

        assertFalse(list.contains(p1));
        assertTrue(list.contains(p2));
        assertTrue(list.contains(p3));

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        Person removedStudent = list.removeItem(2);

        assertTrue(removedStudent.equals(s1));

        assertFalse(list.contains(s1));
        assertTrue(list.contains(s2));

    }

    @Test
    public void testClear() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testToArray() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        Object[] items = list.toArray();

        assertTrue(items[0] instanceof Person);
        assertTrue(items[1] instanceof Person);
        assertTrue(items[2] instanceof Person);
        assertTrue(items[3] instanceof Student);
        assertTrue(items[4] instanceof Student);
    }

    @Test
    public void testSize() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        assertEquals(5, list.size());
    }

    @Test
    public void testGetItem() {
        Person p1 = new Person("Adid", "Mirpur", 21);
        Person p2 = new Person("Hasin", "Uttara", 21);
        Person p3 = new Person("Nirjhar", "Uttara", 22);

        list.addItem(p1);
        list.addItem(p2);
        list.addItem(p3);

        Student s1 = new Student("Adid", "Mirpur", 21, "IUT");
        Student s2 = new Student("Hasin", "Uttara", 21, "IUT");

        list.addItem(s1);
        list.addItem(s2);

        assertEquals(p1, list.getItem(0));
        assertEquals(p2, list.getItem(1));
        assertEquals(p3, list.getItem(2));
        assertEquals(s1, list.getItem(3));
        assertEquals(s2, list.getItem(4));
    }
}
