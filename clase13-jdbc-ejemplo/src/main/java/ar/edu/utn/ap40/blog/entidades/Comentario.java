package ar.edu.utn.ap40.blog.entidades;

import com.google.gson.Gson;

public class Comentario {
	private int id;
	private String nombre;
	private String cuerpo;

	public Comentario() {

	}

	public Comentario(String nombre, String cuerpo) {
		this.nombre = nombre;
		this.cuerpo = cuerpo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String mostrar() {
		Gson gson = new Gson();
		return "Comentario: " + gson.toJson(this, Comentario.class);
	}
}
