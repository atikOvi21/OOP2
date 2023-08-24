public class BiCycle extends Vehicle implements IRideable {

    public BiCycle(String name) {
        super(name);
    }

    @Override
    public void Ride() {
        System.out.println(name + " bicycle is being ridden");
    }
}
