package CustomAnnotations;


@CustomAnnotations.MarkerAnnotation
@CustomAnnotations.Persons({
        @CustomAnnotations.Person(firstName = "Hasin", lastName = "Mahtab", age = 21),
        @CustomAnnotations.Person(firstName = "Hasin", lastName = "Alvee", age = 22)
})
public class MyClass {
    @CustomAnnotations.MarkerAnnotation
    @CustomAnnotations.Author("hasin023")
    public void myMethod() {
        // Method implementation
    }
}
