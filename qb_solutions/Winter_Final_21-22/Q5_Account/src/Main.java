public class Main {
    public static void main(String[] args) {
        ReflectionCheck reflectionCheck = new ReflectionCheck();
        reflectionCheck.checkFieldAccessibility(Account.class, "type");
        reflectionCheck.checkFieldAccessibility(Account.class, "accountNumber");
    }
}