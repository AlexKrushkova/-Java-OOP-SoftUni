package E01HarvestingField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		while(!input.equals("HARVEST")){
			Field[] fields = RichSoilLand.class.getDeclaredFields();

			for (Field fiel: fields) {
				int modifier = fiel.getModifiers();
				String modifierAsString = Modifier.toString(modifier);
				if(modifierAsString.equals(input) || input.equals("all")){
					System.out.println(String.format("%s %s %s",
								modifierAsString,
								fiel.getType().getSimpleName(),
								fiel.getName()));
					}
				}
			input = scanner.nextLine();
		}
	}
}
