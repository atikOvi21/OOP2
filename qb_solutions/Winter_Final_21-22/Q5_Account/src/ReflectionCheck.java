import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionCheck {
    public void checkFieldAccessibility(Class<?> myClass, String fieldName) {
        try {
            Field field = myClass.getDeclaredField(fieldName);

            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println(STR."Field \{fieldName} is private");
            } else if(Modifier.isPublic(field.getModifiers())) {
                System.out.println(STR."Field \{fieldName} is public");
            } else {
                System.out.println(STR."Field \{fieldName} has different access modifier");
            }
        } catch (NoSuchFieldException e) {
            System.out.println(STR."No such field \{fieldName} found");
        }
    }
}
