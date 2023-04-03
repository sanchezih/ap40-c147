package ar.edu.utn.ap40.qatar2022.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.qatar2022.DBManager;
import ar.edu.utn.ap40.qatar2022.entidades.Departamento;

public class PublicacionService {

	/**
	 * 
	 * @param departamento
	 */
	public void crearDepartamento(Departamento departamento) {
		String query = "INSERT INTO DEPARTAMENTO  (nombre, presupuesto) VALUES ('" + departamento.getNombre() + "', "
				+ departamento.getPresupuesto() + ")";
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
	public Departamento getDepartamento(int id) {
		Departamento departamento = null;
		String query = "SELECT * FROM DEPARTAMENTO WHERE cd_departamento = '" + id + "'";
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.next()) {
				departamento = new Departamento();
				departamento.setId(rs.getInt(1));
				departamento.setNombre(rs.getString(2));
				departamento.setPresupuesto(rs.getInt(3));
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
		return departamento;

	}

	public ArrayList<Departamento> getDepartamentos() {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		String query = "SELECT * FROM DEPARTAMENTO";
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);

			while (rs.next()) {
				Departamento departamento = null;
				departamento = new Departamento();
				departamento.setId(rs.getInt(1));
				departamento.setNombre(rs.getString(2));
				departamento.setPresupuesto(rs.getInt(3));

				departamentos.add(departamento);
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
		return departamentos;
	}
}
