package Erasure;

// This is after the erasure in compile time.
public class AfterDefaultErasure<Object> {
    public void GenericMethod(Object thingElement, Object[] thingArray) {
        for (Object thingy: thingArray) {
            if (thingy.equals(thingElement)) {
                System.out.println(thingy);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}
