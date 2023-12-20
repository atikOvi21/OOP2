package GenericStack;

public class GenericStackTest {
    private final Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    private final Integer[] intElements = {1, 2, 3, 4, 5, 6, 7, 8};

    private final StackClass<Double> doubleStack;
    private final StackClass<Integer> intStack;

    public GenericStackTest() {
        doubleStack = new StackClass<>(10);
        intStack = new StackClass<>(10);

        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack, doubleElements);
        testPush("intStack", intStack, intElements);
        testPop("intStack", intStack, intElements);
    }

    private <T> void testPush(String stackName, StackClass<T> stackClass, T[] elements) {
        System.out.println(STR."Pushing elements onto \{stackName}");

        try{
            for(T element : elements) {
                System.out.println(element);
                stackClass.push(element);
            }
        } catch (StackFullException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }

    private <T> void testPop(String stackName, StackClass<T> stackClass, T[] elements) {
        System.out.println(STR."\nPopping elements from \{stackName}");
        T popValue;

        try {
            while(!stackClass.isEmpty()) {
                popValue = stackClass.pop();
                System.out.println(popValue);
            }
        } catch (StackEmptyException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }

}
