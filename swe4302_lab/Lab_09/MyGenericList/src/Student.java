public class Student extends Person{
    private final String universityName;

    public Student(String name, String address, int age, String universityName) {
        super(name, address, age);
        this.universityName = universityName;
    }

    public void study() {
        System.out.println("I am studying at " + universityName);
    }
}
