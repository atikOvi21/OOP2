package CommonComparator;

public class Person implements Sortable{
    private final String name;

    public Person(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
