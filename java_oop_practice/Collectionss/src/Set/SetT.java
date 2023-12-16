package Set;

import java.util.*;

public class SetT {
    private static final String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

    public SetT(){
        List<String> list = Arrays.asList(colors);
        System.out.println("List: " + list);
        printNonDuplicates(list);
    }

    private void printNonDuplicates(Collection<String> collection){
        Set<String> set = new HashSet<String>(collection);

        System.out.println("\nNon-duplicates are: ");
        System.out.print("[ ");
        for(String s : set){
            System.out.print(s + " ");
        }
        System.out.print("]");
    }
}
