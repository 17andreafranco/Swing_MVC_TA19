package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class CrearDBAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	
	public CrearDBAction(vistaSwing ventana, String mensaje) {
		this.ventana = ventana;
		this.mensaje = mensaje;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		try {
			modelo.createDBQuery();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ventana.escriureMissatge(this.mensaje);

	}

}
