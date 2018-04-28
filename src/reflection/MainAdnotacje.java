package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainAdnotacje {
    public static void main(String[] args) {
        docStrategy();


    }
    public static void docStrategy (){
        Method[] methods = Parson.class.getDeclaredMethods();
        Field[] fields = Parson.class.getFields();
        Constructor[] constructors = Parson.class.getConstructors();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Doc.class)){
                System.out.println(method.getAnnotation(Doc.class).info());
            }
        }
        for (Field field : fields) {
            if (field.isAnnotationPresent(Doc.class)){
                System.out.println(field.getAnnotation(Doc.class).info());
            }
        }
        for (Constructor constructor : constructors) {
            if (constructor.isAnnotationPresent(Doc.class)){
                System.out.println(constructor.getAnnotation(Doc.class));
            }
        }
    }
}
