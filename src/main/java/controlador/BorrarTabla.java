package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class BorrarTabla implements ActionListener {

	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	private int i;

	public BorrarTabla(vistaSwing ventana, String mensaje, int i) {
		this.ventana = ventana;
		this.mensaje = mensaje;
		this.i = i;
	}

	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		try {
			modelo.deleteTable(i);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge(this.mensaje);
		ventana.botonesMenuEnable();

	}

}
