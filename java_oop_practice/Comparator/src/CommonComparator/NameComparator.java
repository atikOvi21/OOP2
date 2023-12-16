package CommonComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Sortable>{
    @Override
    public int compare(Sortable o1, Sortable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
