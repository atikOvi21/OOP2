package EvenOdd;

import java.util.List;

public interface CountAlgorithm {
    int getCount(List<? extends Number> list);
    void resetCount();
}
