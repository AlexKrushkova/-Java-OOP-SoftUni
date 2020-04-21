package E02BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BlackBoxInt blackBoxInt;
        try {
            Constructor<?> ctor = BlackBoxInt.class.getDeclaredConstructor();
            ctor.setAccessible(true);
            Object obj = ctor.newInstance();
            assert obj instanceof BlackBoxInt;
            blackBoxInt = (BlackBoxInt)obj;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw  new Exception(e);
        }

        Map<String,Method> methodsByName =
                Arrays.stream(blackBoxInt.getClass().getDeclaredMethods())
                        .peek(m -> m.setAccessible(true))
                .collect(Collectors.toMap(Method::getName, m ->m));


        while(!input.equals("END")){
            String[] tokens = input.split("_");
            String command = tokens[0];
            int param = Integer.parseInt(tokens[1]);

            Method method = methodsByName.get(command);
            method.invoke(blackBoxInt, param);

            Field innerValue = BlackBoxInt.class.getDeclaredField("innerValue");
            innerValue.setAccessible(true);

            int value = (int)innerValue.get(blackBoxInt);
            System.out.println(value);

            input = scanner.nextLine();
        }
    }
}
