package vista;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Andrea
 *
 */
public class vista {

	public vista() {

	}

	public void askRegister() {
		System.out.println("Que registro quieres borrar?");
	}

	public String correctQuery(String Query) {
		return (Query + "- ok!");
	}

	public void numeroIncorrecto() {
		System.out.println("Valor de entrada incorrecto");
	}

	public void cerrar() {
		System.out.println("Programa cerrrado");
	}

	// Select
	public void nombreOId() {
		System.out.println("Consultar: ");
		System.out.println("1. Nombre");
		System.out.println("2. ID");
	}

	public void nombreIdPrecio() {
		System.out.println("Consultar: ");
		System.out.println("1. Codigo");
		System.out.println("2. ID");
		System.out.println("3. Precio");
	}

	public void insertID() {
		System.out.print("ID:");
	}

	public void insertNombre() {
		System.out.print("Nombre:");
	}

	public void insertPrecio() {
		System.out.print("Precio:");
	}

	public void insertCodigo() {
		System.out.print("Codigo:");
	}

	public static String[] resultSelectPieza(ResultSet rs) throws SQLException {

		String result[] = new String[50];
		int i = 0;
		while (rs.next()) {
			result[i] = ("La pieza con id " + rs.getInt(1) + " tiene el nombre " + rs.getString(2));
			i++;
		}
		return result;
	}

	
	public static String[] resultSelectProveedor(ResultSet rs) throws SQLException {

		String result[] = new String[50];
		int i = 0;
		while (rs.next()) {
			result[i] = ("El proveedor con id " + rs.getString(1) + " tiene el nombre " + rs.getString(2));
			i++;
		}
		return result;
	}

	public static String[] resultSelectSuministra(ResultSet rs) throws SQLException {
		
		String result[] = new String[50];
		int i = 0;
		while (rs.next()) {
			result[i] = ("Suministra con codigo " + rs.getInt(1) + " y el proveedor " + rs.getString(2)
			+ " tiene el precio " + rs.getInt(3));
			System.out.println(result[i]);
			i++;
		}
		return result;

		
	}

}
