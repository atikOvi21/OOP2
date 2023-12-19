package Erasure;
@SuppressWarnings({"unchecked", "rawtypes"})
public class AfterUpperBoundErasure {
    public Comparable returnMax(Comparable x, Comparable y, Comparable z) {
        Comparable maximum = x;

        if(y.compareTo(maximum) > 0) {
            maximum = y;
        } else if( z.compareTo(maximum) > 0) {
            maximum = z;
        }

        return maximum;
    }
}
