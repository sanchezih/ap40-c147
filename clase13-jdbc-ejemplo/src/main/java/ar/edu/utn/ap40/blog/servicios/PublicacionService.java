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

public class PublicacionService {

	/**
	 * 
	 * @param publicacion
	 */
	public void crearDepartamento(Publicacion publicacion) {
		String query = "INSERT INTO PUBLICACION (titulo, cuerpo) VALUES (?,?)";
		Connection conexion = DBManager.getInstance().connect();
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(query);
			preparedStatement.setString(1, publicacion.getTitulo());
			preparedStatement.setString(2, publicacion.getCuerpo());
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
	 * @param idPublicacion
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Publicacion> getPublicaciones(int idPublicacion) {

		boolean isPublicacionUnica = idPublicacion != -1 ? true : false;

		StringBuilder query = new StringBuilder();
		ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
		query.append("SELECT * FROM PUBLICACION");

		if (isPublicacionUnica) {
			query.append(" WHERE cd_publicacion = ?");
		}
		
		Connection conexion = DBManager.getInstance().connect();

		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(query.toString());
			
			if (isPublicacionUnica) {
				preparedStatement.setInt(1, idPublicacion);
			}
		
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Publicacion publicacion = null;
				publicacion = new Publicacion();
				publicacion.setId(resultSet.getInt("cd_publicacion"));
				publicacion.setTitulo(resultSet.getString("titulo"));
				publicacion.setCuerpo(resultSet.getString("cuerpo"));

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
