import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface DevelopmentHistoryWithReviewer {
    double version() default 1.0;
    String developer() default "hasin023";
    String tester() default "Hasin";
    String[] reviewers() default {"Hasin", "Mahtab", "Alvee"};
}
