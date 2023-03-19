package ar.edu.utn.ap40.carrito.src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ar.edu.utn.ap40.carrito.src.descuentos.Descuento;
import ar.edu.utn.ap40.carrito.src.descuentos.DescuentoFijo;
import ar.edu.utn.ap40.carrito.src.descuentos.DescuentoPorcentaje;
import ar.edu.utn.ap40.carrito.src.descuentos.DescuentoPorcentajeConTope;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String archivo = new File("src/main/resources/items.txt").getAbsolutePath();

		CarritoCompra carrito1 = new CarritoCompra(20230315);

		for (String linea : Files.readAllLines(Paths.get(archivo))) {

			String[] values = linea.split("\t");

			String cantidad = values[0];
			String precioUnitario = values[1];
			String nombre = values[2];

			ItemCarrito itemCarrito = new ItemCarrito(Integer.parseInt(cantidad),
					new Producto(nombre, Integer.parseInt(precioUnitario)));

			carrito1.agregarItem(itemCarrito);
		}

		if (args.length != 0) {

			switch (args[0]) {

			case "DF": // Descuento Fijo
				Descuento df = new DescuentoFijo(Integer.parseInt(args[1]));
				System.out.println(carrito1.precio(df));
				break;

			case "DP": // Descuento Porcentaje
				Descuento dp = new DescuentoPorcentaje(Integer.parseInt(args[1]));
				System.out.println(carrito1.precio(dp));
				break;

			case "DPT": // Descuento Porcentaje con Tope
				Descuento dpt = new DescuentoPorcentajeConTope(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
				System.out.println(carrito1.precio(dpt));
				break;
			}
		} else {
			Descuento descuento = new DescuentoFijo(0); // Creo un descuento 0
			System.out.println(carrito1.precio(descuento));
		}
	}
}
