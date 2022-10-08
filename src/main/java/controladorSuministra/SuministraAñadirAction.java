package controladorSuministra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class SuministraAñadirAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	public SuministraAñadirAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirSuministra();
		try {
			modelo.insertSuministra(ventana.getIDPiezas(),ventana.getIDProveedor(), ventana.getPrecio());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge("Añadir");
		ventana.botonesMenuEnable();

	}

}
