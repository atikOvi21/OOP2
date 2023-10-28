package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

    public UsingToArray(){
        String[] colors = {"black", "blue", "yellow"};

        LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));

        list.addLast("red");
        list.add("pink");
        list.add(3, "green");
        list.addFirst("cyan");

        colors = list.toArray(new String[0]);

        System.out.println("Colors: ");

        for (String color : colors) {
            System.out.println(color);
        }

    }
}
