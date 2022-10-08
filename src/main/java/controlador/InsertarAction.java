package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class InsertarAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	
	public InsertarAction(vistaSwing ventana, String mensaje) {
		this.ventana = ventana;
		this.mensaje = mensaje;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		modelo.insertValues();
		ventana.escriureMissatge(this.mensaje);

	}

}
