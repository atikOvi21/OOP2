import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());
        System.out.println(intQueue.dequeue());

        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Goodbye");
        stringQueue.enqueue("World");

        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
    }
}

// Advantages of Generics

//Reusability
//Code Clarity: Generics make the code more readable and self-explanatory.
//Flexibility: The generic queue class can be instantiated for any class that implements the Comparable interface.
//Compile-Time Type Safety: The use of generics provides compile-time type safety.
//Reduced Casting: With generics, you don't need to explicitly cast objects when retrieving them from the queue

// Disadvantages of Generics

// Limited to Object Types: Generics in Java are limited to object types, and primitive types cannot be directly used.
//Type Erasure: Java uses type erasure for generics, which means that type information is removed at runtime.
//Limited to Compile-Time Type Checking: While generics provide compile-time type checking, this checking is limited to compile time.
//Inheritance and Generics Can Be Tricky: The interaction between generics and inheritance can sometimes lead to complex scenarios.
//Performance Overhead: The use of generics may introduce a slight performance overhead due to the need for type checking and type erasure.