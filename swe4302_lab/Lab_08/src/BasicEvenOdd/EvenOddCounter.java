package BasicEvenOdd;

import java.util.List;

public class EvenOddCounter<Thingy extends Number> {
    private int evenCount;
    private int oddCount;

    public EvenOddCounter(){
        evenCount = 0;
        oddCount = 0;
    }

    public int getCount(List<Thingy> list, String operation){
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        for(Thingy number : list){
            if(operation.equals("even")){
                if(number.doubleValue() % 2 == 0){
                    evenCount++;
                }
            }
            else if(operation.equals("odd")){
                if(number.doubleValue() % 2 != 0){
                    oddCount++;
                }
            }
        }
        if(operation.equals("even")){
            return evenCount;
        }
        else if(operation.equals("odd")){
            return oddCount;
        }
        else{
            throw new IllegalArgumentException("Operation must be even or odd");
        }
    }

    public void resetCount(){
        evenCount = 0;
        oddCount = 0;
    }
}
