package EvenOdd;

import java.util.List;

public class EvenCounter<Thingy extends Number> implements CountAlgorithm{
    private int evenCount;

    public EvenCounter(){
        evenCount = 0;
    }

    @Override
    public int getCount(List<? extends Number> list) {
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        for(Number number : list){
            if(number.doubleValue() % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

    @Override
    public void resetCount(){
        evenCount = 0;
    }
}
