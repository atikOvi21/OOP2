package Creational_Patterns.Abstract_Factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
