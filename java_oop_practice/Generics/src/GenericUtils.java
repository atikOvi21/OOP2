public class GenericUtils {
    public static <Thingy extends Comparable<Thingy>> Thingy findMax(Thingy[] items){
        if(items == null || items.length == 0){
            throw new IllegalArgumentException("Must include items");
        }

        Thingy max = items[0];
        for( Thingy item : items ){
            if( item.compareTo(max) > 0 ){
                max = item;
            }
        }

        return max;
    }

    public static <Thingy extends Comparable<Thingy>> Thingy findMin(Thingy[] items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        Thingy min = items[0];
        for (Thingy item : items) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }

        return min;
    }
}
