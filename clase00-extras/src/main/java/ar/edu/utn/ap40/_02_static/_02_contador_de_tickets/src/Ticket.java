package ar.edu.utn.ap40._02_static._02_contador_de_tickets.src;

public class Ticket {

	private static int contador = 0;
	private int numero;
	private String fechaCompra;
	private String dniPersona;

	public Ticket(String fechaCompra, String dniPersona) {
		contador++;
		this.numero = contador;
		this.fechaCompra = fechaCompra;
		this.dniPersona = dniPersona;
	}

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaCompra=" + fechaCompra + ", dniPersona=" + dniPersona + "]";
	}

}
