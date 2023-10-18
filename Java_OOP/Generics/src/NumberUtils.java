public class NumberUtils{
    public static <Thingy extends Number> double sum(Thingy[] items){
        if(items == null || items.length == 0){
            throw new IllegalArgumentException("Items cannot be null or empty");
        }

        double sum = 0.0;
        for(Thingy item : items){
            sum += item.doubleValue();
        }
        return sum;
    }
}
