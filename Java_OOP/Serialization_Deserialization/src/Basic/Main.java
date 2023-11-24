package Basic;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/Basic/serialized.txt";
        SerializationManager sm = new SerializationManager(fileName);
        Student student = new Student(1, "Hasin", "Dhaka");
        Student studentM = new Student(2, "Mahtab", "Uttara");

        sm.serialize(student);
//        sm.serialize(studentM);

        Student deserializedStudent = (Student) sm.deserialize();
//        Student deserializedStudentM = (Student) sm.deserialize();
        System.out.println(deserializedStudent.toString());
//        System.out.println(deserializedStudentM.toString());
    }
}
