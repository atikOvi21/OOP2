package Behavioral_Patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("large_image.jpg");

        // The actual image loading occurs when calling display on the proxy
        image.display();

        // Subsequent calls to display use the already loaded image
        image.display();
    }
}
