public class Vehicle {

    public String name;


    public Vehicle(String name) {
        this.name = name;
    }

    public void Start() {
        System.out.println(name + " vehicle started");
    }

    public void Stop() {
        System.out.println(name + " vehicle stopped");
    }
}
