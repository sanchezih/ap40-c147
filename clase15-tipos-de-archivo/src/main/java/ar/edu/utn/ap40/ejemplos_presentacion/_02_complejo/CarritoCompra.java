package ar.edu.utn.ap40.ejemplos_presentacion._02_complejo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CarritoCompra {

	// Cuando se quieren ignorar atributos para no serializar se puede usar sobre la
	// declaración del atributo la anotación @JsonIgnore.
	@JsonIgnore
	private Persona persona;

	private ArrayList<ItemCarrito> items;

	public CarritoCompra() {

	}

	public CarritoCompra(Persona persona) {
		super();
		this.persona = persona;
		this.items = new ArrayList<ItemCarrito>();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public ArrayList<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemCarrito> items) {
		this.items = items;
	}

	public void agregarItem(ItemCarrito item) {
		items.add(item);

	}
}
