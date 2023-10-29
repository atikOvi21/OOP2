package Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms_Copy {
    private Character[] letters = {'P', 'C', 'M'};
    private Character[] lettersCopy;
    private List<Character> lettersList;
    private List<Character> lettersListCopy;

    public Algorithms_Copy(){
        lettersList = Arrays.asList(letters);
        lettersCopy = new Character[letters.length];
        lettersListCopy = Arrays.asList(lettersCopy);

        System.out.println("Initial List: " + lettersList);
        output(lettersList);

        Collections.reverse(lettersList);
        System.out.println("Reverse List: " + lettersList);
        output(lettersList);

        Collections.copy(lettersListCopy, lettersList);
        System.out.println("Copy of List: " + lettersListCopy);
        output(lettersListCopy);

        Collections.fill(lettersList, 'K');
        System.out.println("After fill(): " + lettersList);
        output(lettersList);
    }

    private void output(List<Character> list){
        System.out.print("The list is: [ ");
        for(Character element : list){
            System.out.print(element + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Max : " + Collections.max(list));
        System.out.println("Min : " + Collections.min(list));
        System.out.println();
    }
}
