package ar.edu.utn.ap40.ejemplos_presentacion.carrito.src;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.descuentos.Descuento;
import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.excepciones.DescuentoInvalidoException;
import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.excepciones.NoHayStockException;
import ar.edu.utn.ap40.ejemplos_presentacion.carrito.src.excepciones.PrecioInvalidoException;

public class CarritoCompra {

	/*
	 * En este caso, la coleccion se declara como atributo y es necesaria usar la
	 * sintaxis <> para indicar de que tipo son los elementos de la lista. Notar por
	 * otro lado que cuando se declara, se hace con la interfaz y no con la
	 * implementacion
	 */
	private List<ItemCarrito> items;
	private int fecha;

	/*
	 * Es necesario construir la coleccion, en este caso el constructor del objeto
	 * es un buen lugar
	 */
	public CarritoCompra(int fecha) {
		this.items = new ArrayList<ItemCarrito>();
		this.fecha = fecha;
	}

	/*
	 * Se agregan metodos publicos para modificar la lista y obtener sus valores
	 */
	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	public List<ItemCarrito> getItems() {
		return items;
	}

	/**
	 * 
	 * @param descuento
	 * @return
	 * @throws PrecioInvalidoException
	 * @throws DescuentoInvalidoException
	 */
	public double precio(Descuento descuento)
			throws NoHayStockException, PrecioInvalidoException, DescuentoInvalidoException {

		float precioFinal = 0;
		for (ItemCarrito item : this.items) {
			float precioItem = item.precio();
			precioFinal += precioItem;
		}

		if (precioFinal <= 0) {
			throw new PrecioInvalidoException("No se pueda aplicar un descuento a un carrito de precio 0");
		}

		int desc = descuento.descuento((int) precioFinal);

		if (desc < 0) {
			throw new DescuentoInvalidoException("El descuento no puede ser menor a 0");
		}

		return precioFinal - desc;
	}

}