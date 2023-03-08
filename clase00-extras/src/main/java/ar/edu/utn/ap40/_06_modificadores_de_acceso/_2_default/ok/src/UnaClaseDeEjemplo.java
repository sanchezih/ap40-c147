package ar.edu.utn.ap40._06_modificadores_de_acceso._2_default.ok.src;

public class UnaClaseDeEjemplo {

	public static int getColorDeLaBicicleta() {
		return Bicicleta.contador; // Accedemos directamente al contador desde otra clase
	}

}