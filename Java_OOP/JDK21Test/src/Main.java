public class Main {
    public static void main(String[] args) {
        String name = "Oke whatever";
        String greeting = STR."Yeah so, \{name}";
        System.out.println(greeting);

        String username = "hasin023";

        var json = STR."""
                {
                  "user": "\{
                                // We only want to use the firstname
                                username
                                }",
                  "Bio": \{name}
                }
                """;

        System.out.println(json);
    }
}