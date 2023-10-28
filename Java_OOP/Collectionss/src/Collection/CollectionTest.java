package Collection;

import java.util.*;

public class CollectionTest {
    private static final String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
    private static final String[] removeColors = {"RED", "WHITE", "BLUE"};

    public CollectionTest(){
        List<String> list = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();

//      for(String color : colors)
//          list.add(color);
        Collections.addAll(list, colors);
        
//      for(String removeColor : removeColors)
//          removeList.add(removeColor);
        Collections.addAll(removeList, removeColors);

        System.out.println("ArrayList: ");
        for(String color : list)
            System.out.printf("%s ", color);

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for(String color : list)
            System.out.printf("%s ", color);
    }

    private void removeColors(Collection<String> list, Collection<String> removeList){

        list.removeIf(removeList::contains);

//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            if(removeList.contains(iterator.next()))
//                iterator.remove();
//        }
    }
}
