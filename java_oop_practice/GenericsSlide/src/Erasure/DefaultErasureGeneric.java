package Erasure;

public class DefaultErasureGeneric<Thing> {
    public void GenericMethod(Thing thingElement, Thing[] thingArray) {
        for (Thing thingy: thingArray) {
            if (thingy.equals(thingElement)) {
                System.out.println(thingy);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}


// After we convert this class to it's datatype using Erasure
// We will replace the <Thing> type with the default <Object>
// In the AfterDefaultErasure.java file

