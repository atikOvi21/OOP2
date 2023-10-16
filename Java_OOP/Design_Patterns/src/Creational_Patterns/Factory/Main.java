package Creational_Patterns.Factory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","32 GB","2 TB","4.6 GHz");
        Computer server = ComputerFactory.getComputer("server","8 GB","256 GB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}

