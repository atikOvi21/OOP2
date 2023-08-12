import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a= sc.nextInt();

        switch (a){
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3 -> System.out.println("Value is 3");
            case 4 -> System.out.println("Value is 4");
            case 5,6,7 -> {
                System.out.println("It was " + a);
            }
            default -> System.out.println("Value is default");
        }
    }
}
