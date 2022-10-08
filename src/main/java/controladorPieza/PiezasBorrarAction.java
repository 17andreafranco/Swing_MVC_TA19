package controladorPieza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class PiezasBorrarAction implements ActionListener {
	
	private vistaSwing ventana;
	private modelo modelo = new modelo();
	
	
	public PiezasBorrarAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirIDPiezas();

		try {
			modelo.deletePiezas(ventana.getIDPiezas());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge("Borrado " +ventana.getIDPiezas());
		ventana.botonesMenuEnable();

	}

}
