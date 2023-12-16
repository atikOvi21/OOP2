package EvenOdd;

import java.util.List;

public class OddCounter<Thingy extends Number> implements CountAlgorithm{
    private int oddCount;

    public OddCounter(){
        oddCount = 0;
    }

    @Override
    public int getCount(List<? extends Number> list) {
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        for(Number number : list){
            if(number.doubleValue() % 2 != 0){
                oddCount++;
            }
        }
        return oddCount;
    }

    @Override
    public void resetCount(){
        oddCount = 0;
    }
}
