package controladorProveedor;

import java.awt.event.ActionEvent;

import vista.vista;

import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class ProveedorConsultarAction implements ActionListener {

	private vistaSwing ventana;
	private modelo modelo = new modelo();

	public ProveedorConsultarAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {

		String result[] = new String[50];

		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirProveedor();
		try {
			result = vista.resultSelectProveedor(modelo.selectProveedors(ventana.getIDProveedor(), ventana.getNombre()));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < result.length && result[i] != null; i++) {
			ventana.escriureMissatge(result[i]+"\n");
		}
		ventana.botonesMenuEnable();

	}

}
