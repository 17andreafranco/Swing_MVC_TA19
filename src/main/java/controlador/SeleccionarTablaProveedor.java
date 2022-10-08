package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class SeleccionarTablaProveedor implements ActionListener {

	private vistaSwing ventana;

	public SeleccionarTablaProveedor(vistaSwing ventana) {
		this.ventana = ventana;

	}

	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		ventana.borrarPanel();
		ventana.buidarMissatge();
		ventana.botonesCRUDProveedor();

	}

}
