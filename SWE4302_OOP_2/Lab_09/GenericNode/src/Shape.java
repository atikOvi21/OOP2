public class Shape {
    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printShape() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public String getName() { return name; }
}
