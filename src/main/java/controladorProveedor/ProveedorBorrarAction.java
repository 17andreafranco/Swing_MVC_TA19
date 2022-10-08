package controladorProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class ProveedorBorrarAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	public ProveedorBorrarAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirIDProveedor();

		try {
			modelo.deleteProveedor(ventana.getIDProveedor());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge("Borrado " +ventana.getIDProveedor());
		ventana.botonesMenuEnable();

	}

}
