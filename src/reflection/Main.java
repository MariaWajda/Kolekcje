package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Method[] methodsInMyClass = Parson.class.getDeclaredMethods();
        try {
            Parson person = Parson.class.newInstance();

            for (Method inMyClass : methodsInMyClass) {
                if (inMyClass.getName().equals("shout")){
                    inMyClass.setAccessible(true);
                    inMyClass.invoke(person, null);
                }
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        for (Method method : methodsInMyClass) {
            System.out.println(method.getModifiers()); //omijanie modyfikatorów dostępu
        }

        int counter = 0;
        for (Method inMyClass : methodsInMyClass) {
            counter += inMyClass.getParameterCount();
        }
        System.out.println(counter);







    }

}
