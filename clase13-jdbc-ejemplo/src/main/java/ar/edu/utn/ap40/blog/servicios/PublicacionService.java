package ar.edu.utn.ap40.blog.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.blog.DBManager;
import ar.edu.utn.ap40.blog.entidades.Comentario;
import ar.edu.utn.ap40.blog.entidades.Publicacion;

public class PublicacionService {

	/**
	 * 
	 * @param p
	 */
	public void crearDepartamento(Publicacion p) {
		String query = "INSERT INTO PUBLICACION  (titulo, cuerpo) VALUES ('" + p.getTitulo() + "', '" + p.getCuerpo()
				+ "')";
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
	 * @param id
	 * @return
	 */
	public ArrayList<Publicacion> getPublicaciones(int id) {
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
		StringBuilder query = new StringBuilder();

		query.append("SELECT * FROM PUBLICACION");

		if (id != -1) {
			query.append(" WHERE cd_publicacion = '" + id + "'");
		}

		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query.toString());
			while (rs.next()) {
				Publicacion p = null;
				p = new Publicacion();
				p.setId(rs.getInt(1));
				p.setTitulo(rs.getString(2));
				p.setCuerpo(rs.getString(3));

				ComentarioService cs = new ComentarioService();
				ArrayList<Comentario> comentarios = cs.getComentarios(p);
				p.setComentarios(comentarios);

				publicaciones.add(p);

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
