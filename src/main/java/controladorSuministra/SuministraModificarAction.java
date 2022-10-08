package controladorSuministra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modelo.modelo;
import vista.vistaSwing;

public class SuministraModificarAction implements ActionListener {
	
	private vistaSwing ventana;
	private String mensaje;
	private modelo modelo = new modelo();
	
	public SuministraModificarAction(vistaSwing ventana) {
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.añadirSuministra();
		try {
			modelo.updateSuministra(ventana.getIDPiezas(),ventana.getIDProveedor(), ventana.getPrecio());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ventana.escriureMissatge("Modificado "+ ventana.getIDPiezas()+" "+ventana.getIDProveedor() +" "+ ventana.getPrecio() );
		ventana.botonesMenuEnable();

	}

}
