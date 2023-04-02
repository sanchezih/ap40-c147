package ar.edu.utn.ap40.guia_ejercicios.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.guia_ejercicios.DBManager;
import ar.edu.utn.ap40.guia_ejercicios.entidades.Departamento;
import ar.edu.utn.ap40.guia_ejercicios.entidades.Empleado;

public class EmpleadoService {
	/**
	 * 
	 * @param empleado
	 */
	public void crearEmpleado(Empleado empleado) {

		String query = "INSERT INTO EMPLEADO (dni, nombre, apellido, nacionalidad, cd_departamento) VALUES ('"
				+ empleado.getDni() + "', '" + empleado.getNombre() + "', '" + empleado.getApellido() + "', '"
				+ empleado.getNacionalidad() + "', " + empleado.getDepartamento().getId() + ")";

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

	public ArrayList<Empleado> getEmpleados() {

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		String query = "SELECT * FROM EMPLEADO";
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);

			while (rs.next()) {
				Empleado empleado = new Empleado();

				empleado.setId(rs.getInt(1));
				empleado.setDni(rs.getString(2));
				empleado.setNombre(rs.getString(3));
				empleado.setApellido(rs.getString(4));
				empleado.setNacionalidad(rs.getString(5));

				int idDepartamento = rs.getInt(6);
				DepartamentoService departamentoService = new DepartamentoService();
				Departamento departamento = departamentoService.getDepartamento(idDepartamento);

				empleado.setDepartamento(departamento);

				empleados.add(empleado);
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
		return empleados;
	}
}
