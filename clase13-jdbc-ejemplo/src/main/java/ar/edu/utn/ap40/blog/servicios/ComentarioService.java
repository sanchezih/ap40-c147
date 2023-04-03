package ar.edu.utn.ap40.blog.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.blog.db.DBManager;
import ar.edu.utn.ap40.blog.entidades.Comentario;
import ar.edu.utn.ap40.blog.entidades.Publicacion;

public class ComentarioService {

	/**
	 * 
	 * @param comentario
	 * @param idPublicacion
	 */
	public void crearComentario(Comentario comentario, int idPublicacion) {
		
		String query = "INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES ('" + comentario.getNombre()
				+ "', '" + comentario.getCuerpo() + "', '" + idPublicacion + "')";
		
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
	 * @param publicacion
	 * @return
	 */
	public ArrayList<Comentario> getComentarios(Publicacion publicacion) {
		ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
		String query = "SELECT * FROM COMENTARIO WHERE cd_publicacion = " + publicacion.getId();
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);

			while (rs.next()) {
				Comentario comentario = null;
				comentario = new Comentario();
				comentario.setId(rs.getInt(1));
				comentario.setNombre(rs.getString(2));
				comentario.setCuerpo(rs.getString(3));

				comentarios.add(comentario);
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
		return comentarios;
	}

}
