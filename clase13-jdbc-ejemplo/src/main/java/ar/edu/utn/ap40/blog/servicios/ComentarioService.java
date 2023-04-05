package ar.edu.utn.ap40.blog.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		String query = "INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES (?,?,?)";
		Connection conexion = DBManager.getInstance().connect();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = conexion.prepareStatement(query);
			preparedStatement.setString(1, comentario.getNombre());
			preparedStatement.setString(2, comentario.getCuerpo());
			preparedStatement.setInt(3, idPublicacion);
			preparedStatement.executeUpdate();
			conexion.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
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
		String query = "SELECT * FROM COMENTARIO WHERE cd_publicacion = ?";
		Connection conexion = DBManager.getInstance().connect();

		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(query);
			preparedStatement.setInt(1, publicacion.getId());
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Comentario comentario = null;
				comentario = new Comentario();
				comentario.setId(resultSet.getInt("cd_comentario"));
				comentario.setNombre(resultSet.getString("nombre"));
				comentario.setCuerpo(resultSet.getString("cuerpo"));

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
