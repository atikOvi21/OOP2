package Erasure;

public class UpperBoundErasure {
    public <Thing extends Comparable<Thing>> Thing returnMax(Thing x, Thing y, Thing z) {
        Thing maximum = x;

        if(y.compareTo(maximum) > 0) {
            maximum = y;
        } else if( z.compareTo(maximum) > 0) {
            maximum = z;
        }

        return maximum;
    }
}

// Here, we replace the <Thing> generic type to the upper bound
// which is the <Comparable> type. As it is the Upperbound.