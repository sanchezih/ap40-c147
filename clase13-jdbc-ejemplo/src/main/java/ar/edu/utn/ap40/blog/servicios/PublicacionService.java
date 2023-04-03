package ar.edu.utn.ap40.blog.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.blog.db.DBManager;
import ar.edu.utn.ap40.blog.entidades.Comentario;
import ar.edu.utn.ap40.blog.entidades.Publicacion;

public class PublicacionService {

	/**
	 * 
	 * @param publicacion
	 */
	public void crearDepartamento(Publicacion publicacion) {
		String query = "INSERT INTO PUBLICACION  (titulo, cuerpo) VALUES ('" + publicacion.getTitulo() + "', '"
				+ publicacion.getCuerpo() + "')";
		Connection connection = DBManager.getInstance().connect();
		try {
			Statement s = connection.createStatement();
			s.executeUpdate(query);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
				e.printStackTrace();
				// throw new DAOException("Error al conectar con la base de datos", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param idPublicacion
	 * @return
	 */
	public ArrayList<Publicacion> getPublicaciones(int idPublicacion) {
		
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
		StringBuilder query = new StringBuilder();

		query.append("SELECT * FROM PUBLICACION");

		if (idPublicacion != -1) {
			query.append(" WHERE cd_publicacion = '" + idPublicacion + "'");
		}

		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query.toString());
			while (rs.next()) {
				Publicacion publicacion = null;
				publicacion = new Publicacion();
				publicacion.setId(rs.getInt(1));
				publicacion.setTitulo(rs.getString(2));
				publicacion.setCuerpo(rs.getString(3));

				ComentarioService comentarioService = new ComentarioService();
				ArrayList<Comentario> comentarios = comentarioService.getComentarios(publicacion);
				publicacion.setComentarios(comentarios);

				publicaciones.add(publicacion);

			}
		} catch (SQLException e) {
			try {
				conexion.rollback();
				e.printStackTrace();
				// throw new DAOException("Error al conectar con la base de datos", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conexion.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return publicaciones;
	}

}
