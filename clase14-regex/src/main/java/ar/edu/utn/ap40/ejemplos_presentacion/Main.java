package ar.edu.utn.ap40.ejemplos_presentacion;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String linea = "ramonperez@gmail.com";
		boolean res = linea.matches("([a-z]|[0-9])+@[a-z]+\\.[a-z]+"); // -> True
		System.out.println(res);

		String regex = "([a-z]|[0-9])+@[a-z]+\\.[a-z]+";
		final Pattern pattern = Pattern.compile(regex);
		boolean res2 = pattern.matcher(linea).matches(); // -> True
		System.out.println(res2);

	}

}
