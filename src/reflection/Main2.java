package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {
    public static void main(String[] args) {

        try {
            Parson person = Parson.class.newInstance();
            Parson.class.getMethod("setAge", int.class).invoke(person, 5);
            System.out.println(Parson.class.getMethod("getAge").invoke(person));


        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
