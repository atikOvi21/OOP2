import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationsTest {
    @Test
    public void MethodAnnotationTest() {

        Object faculty = new Faculty("Hasin", "Lecturer", 50000.0);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> methodNames = new ArrayList<>();

        for (Method m: methods) {
            System.out.println("MethodName : " + m.getName());
            boolean isAnnotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (isAnnotationPresent) {
                System.out.println("Annotation Present");
                methodNames.add(m.getName());
            }
        }

        Assert.assertEquals(2, methodNames.size());
        Assert.assertTrue(methodNames.contains("teach"));
        Assert.assertTrue(methodNames.contains("research"));

    }
}
