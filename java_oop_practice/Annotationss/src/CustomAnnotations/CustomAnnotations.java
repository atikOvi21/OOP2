package CustomAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotations {

    // MAKER ANNOTATION

    // A marker annotation is an annotation without any elements. It's used as a flag to indicate that
    // a class or method belongs to a particular category or should be treated in a special way.
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    public @interface MarkerAnnotation {
    }


    // SINGLE-VALUED ANNOTATION

    // A single-value annotation allows you to provide a single value as an attribute.
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Author {
        String value() default "Unknown";
    }


    // MULTI-VALUED ANNOTATION

    // A multi-valued annotation allows you to provide multiple values for a single attribute.

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Person {
        String firstName();
        String lastName();
        int age();
    }

    // REPEATING ANNOTATION

    // A repeating annotation allows you to specify the same
    // annotation more than once for a given class or method.

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Persons {
        Person[] value();
    }

}
