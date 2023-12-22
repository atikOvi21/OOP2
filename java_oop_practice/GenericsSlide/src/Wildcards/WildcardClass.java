package Wildcards;

import java.util.List;

public class WildcardClass<T> {

    // This method will accept any list of any type that extends T
    public int countOfList(List<? extends T> list) {
        int count = 0;
        for (Object elem : list) {
            count ++;
        }
        return count;
    }
}
