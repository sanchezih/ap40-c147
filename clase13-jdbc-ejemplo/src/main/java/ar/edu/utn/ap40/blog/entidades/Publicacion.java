package ar.edu.utn.ap40.blog.entidades;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Publicacion {

	private int id;
	private String titulo;
	private String cuerpo;
	private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();

	public Publicacion() {

	}

	public Publicacion(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", comentarios=" + comentarios
				+ "]";
	}

	public String mostrar() {
		Gson gson = new Gson();
		return "Publicacion: " + gson.toJson(this, Publicacion.class);
	}
}
