package RawTypes;

import GenericStack.StackClass;
import GenericStack.StackEmptyException;
import GenericStack.StackFullException;

import java.util.Stack;
@SuppressWarnings("unchecked")
public class RawStacks {
    private final Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    private final Integer[] integerElements = {1, 2, 3, 4, 5};

    public RawStacks() {
        StackClass rawDoubleStack = new StackClass(5);
        StackClass rawDoubleStack2 = new StackClass<Double>(5);
        StackClass<Integer> integerStack = new StackClass<>(10);

        testPush("rawDoubleStack", rawDoubleStack, doubleElements);
        testPop("rawDoubleStack", rawDoubleStack);
        testPush("rawDoubleStack2", rawDoubleStack2, doubleElements);
        testPop("rawDoubleStack2", rawDoubleStack2);
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }

    private <T> void testPush(String name, StackClass<T> stackClass, T[] elements) {
        try {
            System.out.printf("%nPushing elements onto %s%n", name);

            for (T element : elements) {
                System.out.printf("%s ", element);
                stackClass.push(element);
            }
        } catch (StackFullException ex) {
            System.out.println();
            System.out.println(ex.getMessage());
        }
    }

    private <T> void testPop( String name, StackClass<T> stackClass){
        try {
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue;

            while (!stackClass.isEmpty()) {
                popValue = stackClass.pop();
                System.out.printf("%s ", popValue);
            }
        } catch (StackEmptyException ex) {
            System.out.println();
            System.out.println(ex.getMessage());
        }
    }
}
