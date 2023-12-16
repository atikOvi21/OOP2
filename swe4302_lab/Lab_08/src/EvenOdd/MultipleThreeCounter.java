package EvenOdd;

import java.util.List;

public class MultipleThreeCounter<Thingy extends Number> implements CountAlgorithm{
    private int multipleThreeCount;

    public MultipleThreeCounter(){
        multipleThreeCount = 0;
    }

    @Override
    public int getCount(List<? extends Number> list) {
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        for(Number number : list){
            if(number.doubleValue() % 3 == 0){
                multipleThreeCount++;
            }
        }
        return multipleThreeCount;

    }

    @Override
    public void resetCount(){
        multipleThreeCount = 0;
    }
}
