package ar.edu.utn.ap40.ejemplos_presentacion._03_entradas.ejemplo02;

import java.util.Scanner;

/**
 * Leer de consola
 * 
 * Otra forma de ingresar datos a un programa es mediante la consola, en este
 * ejemplo el programa nos pedira que escribamos algo y apretemos la tecla
 * "enter" para terminar
 * 
 * @author ihsanch
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Ingrese numeros separados por UN espacio");

		String numeros = scn.nextLine();

		int resultado = 0;

		for (String numeroStr : numeros.split(" ")) {
			int numero = Integer.parseInt(numeroStr);
			resultado = resultado + numero;
		}

		System.out.println("La sumatoria de los int recibidos como argumento es: " + resultado);

		scn.close();
	}
}