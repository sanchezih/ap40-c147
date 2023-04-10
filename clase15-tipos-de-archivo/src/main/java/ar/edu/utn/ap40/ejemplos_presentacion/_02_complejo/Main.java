package ar.edu.utn.ap40.ejemplos_presentacion._02_complejo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonProcessingException {

		// Jackson - Relaciones mas complejas
		Persona ramon = new Persona("Ramon", "Perea");
		
		CarritoCompra carrito = new CarritoCompra(ramon);
		
		Producto prod = new Producto("destornillador", 11, 10f);
		ItemCarrito item = new ItemCarrito();
		item.setCantidad(3);
		item.setProducto(prod);
		carrito.agregarItem(item);
		
		prod = new Producto("tuerca", 1100, 0.01f);
		item = new ItemCarrito();
		item.setCantidad(3);
		item.setProducto(prod);
		carrito.agregarItem(item);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonText = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(carrito);
		System.out.println(jsonText);

	}
}
