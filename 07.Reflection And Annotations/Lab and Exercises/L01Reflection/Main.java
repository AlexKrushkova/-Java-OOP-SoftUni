package L01Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());

        Class<?>[] interfaces =   clazz.getInterfaces();
        for (Class<?> iFace:interfaces) {
            System.out.println(iFace);
        }
        Constructor<?>[] ctros = clazz.getDeclaredConstructors();

        Constructor <?> ctor = clazz.getDeclaredConstructor();
        System.out.println(ctor.newInstance());

    }
}
