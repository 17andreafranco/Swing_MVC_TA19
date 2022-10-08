package controladorProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class ProveedorModificarAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	public ProveedorModificarAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirProveedor();
		try {
			modelo.updateProveedor(ventana.getIDProveedor(), ventana.getNombre());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge("Modificado " +ventana.getIDProveedor() + ventana.getNombre() );
		ventana.botonesMenuEnable();

	}

}
