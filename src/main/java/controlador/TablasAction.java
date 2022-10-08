package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import vista.vistaSwing;

public class TablasAction implements ActionListener {
	
	private vistaSwing ventana;


	
	public TablasAction(vistaSwing ventana) {
		this.ventana = ventana;

	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		ventana.buidarMissatge();
		ventana.botonesTablas();

	}

}
