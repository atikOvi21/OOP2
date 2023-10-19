package EvenOdd;

import java.util.List;

public class Counter {
    public Counter(){}
    public int getTheCount(List<? extends Number> list, CountAlgorithm countAlgorithm){
        return countAlgorithm.getCount(list);
    }
}
