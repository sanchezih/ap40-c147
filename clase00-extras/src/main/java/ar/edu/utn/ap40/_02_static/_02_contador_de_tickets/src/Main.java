package ar.edu.utn.ap40._02_static._02_contador_de_tickets.src;

/**
 * Ver https://www.youtube.com/watch?v=29TnNxNzvZo
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		Ticket t1 = new Ticket("2020/03/08", "11111111");
		Ticket t2 = new Ticket("2020/03/08", "22222222");
		Ticket t3 = new Ticket("2020/03/08", "33333333");
		Ticket t4 = new Ticket("2020/03/08", "44444444");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
