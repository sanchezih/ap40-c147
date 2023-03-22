package ar.edu.utn.ap40;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Persona {
	private String nombre;
	private String apellido;
	private LocalDate dob;
}
