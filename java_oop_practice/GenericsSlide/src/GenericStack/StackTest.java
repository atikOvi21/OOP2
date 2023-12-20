package GenericStack;

public class StackTest {
    private final double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
    private final int[] intElements = {1, 2, 3, 4, 5};

    private final StackClass<Double> doubleStack;
    private final StackClass<Integer> intStack;

    public StackTest() {
        doubleStack = new StackClass<>(10);
        intStack = new StackClass<>(10);

        testPushDouble();
        testPopDouble();
        testPushInt();
        testPopInt();
    }

    private void testPushDouble() {
        System.out.println("Pushing elements onto doubleStack");

        try{
            for(double element : doubleElements) {
                System.out.printf("%.1f ", element);
                doubleStack.push(element);
            }
        } catch (StackFullException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }

    private void testPopDouble() {
        System.out.println("\nPopping elements from doubleStack");
        double popValue;

        try {
            while(!doubleStack.isEmpty()) {
                popValue = doubleStack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch (StackEmptyException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }

    private void testPushInt() {
        System.out.println("\nPushing elements onto intStack");

        try {
            for(int element : intElements) {
                System.out.printf("%d ", element);
                intStack.push(element);
            }
        } catch (StackFullException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }

    private void testPopInt() {
        System.out.println("\nPopping elements from intStack");
        int popValue;

        try {
            while(!intStack.isEmpty()) {
                popValue = intStack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch (StackEmptyException ex) {
            System.err.println();
            System.err.println(ex.getMessage());
        }
    }
}
