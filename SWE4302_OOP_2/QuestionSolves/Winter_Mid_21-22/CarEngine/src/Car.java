public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}




// WHICH IS THE DEPENDENT CLASS AND WHICH IS THE DEPENDEE CLASS?

//public class Car {
//    private Engine engine;
//
//    public Car() {
//        this.engine = new Engine();
//    }
//}


//The class Car has a member variable engine of type Engine.
//        Inside the constructor of the Car class, a new instance of the
//        Engine class is created and assigned to the engine variable.
//        In this context:
//
//        The class Car is the dependent class because it depends on another class,
//        Engine, to create and manage an instance of Engine.
//        The class Engine is the dependee class because it is being used by the
//        Car class to fulfill its functionality.
//        In other words, Car depends on Engine to function correctly, so Car
//        is the dependent class, and Engine is the dependee class.