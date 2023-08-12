public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "ABC123");

        System.out.println(car.getCarInfo());

        for (int i = 1; i<=5 ; i++){
            LPAStudent s = new LPAStudent(2632 + i, switch (i){
                case 1 -> "Harry";
                case 2 -> "Potter";
                case 3 -> "Peter";
                case 4 -> "Parker";
                case 5 -> "Miles";
                default -> "Morales";
            }, "12-09-2001", "Kotlin" );

            System.out.println(s.toString());
        }

        Student pojoStudent = new Student(121221, "Deku", "11-03-2003", "C#");
        LPAStudent lpaStudent = new LPAStudent(121226, "Bakugo", "06-03-2002", "Java");

        System.out.println(pojoStudent);
        System.out.println(lpaStudent);
    }
}