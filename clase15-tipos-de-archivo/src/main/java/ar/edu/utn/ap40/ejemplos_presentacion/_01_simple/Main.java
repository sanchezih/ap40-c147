package ar.edu.utn.ap40.ejemplos_presentacion._01_simple;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper();

		// Jackson - Serializacion
		Producto prod = new Producto("Destornillador", 10, 1.4f);
		String jsonText = objectMapper.writeValueAsString(prod);
		System.out.println(jsonText);

		// Jackson - Parseo
		String json = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";
		Producto prod2 = objectMapper.readValue(json, Producto.class);
		System.out.println(prod2);

		// Jackson - Parseo a un Map
		String json2 = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";
		Map<String, Object> map = objectMapper.readValue(json2, new TypeReference<Map<String, Object>>() {
		});
		System.out.println(map);

	}
}
