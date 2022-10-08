package vista;

import java.awt.*;
import javax.swing.*;


/**
 * @author Andrea
 *
 */
public class vistaSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextArea mensaje = new JTextArea();

	private JPanel panellBotons = new JPanel();
	private JPanel panellBotonsOpcions = new JPanel();

	// Botones menu
	private JButton inicializarButton = new JButton("Inicializar DB");
	private JButton insertarButton = new JButton("Insertar datos");
	private JButton borrarButton = new JButton("Borrar tabla");
	private JButton crudeButton = new JButton("CRUDE por tabla");

	// Botones CRUD Piezas
	private JButton añadirRegistroButton = new JButton("Añadir registro");
	private JButton consultarButton = new JButton("Consultar por ID o nombre");
	private JButton listarButton = new JButton("Listar registros");
	private JButton modificarButton = new JButton("Modificar registro");
	private JButton borrarRegistroButton = new JButton("Borrar registro");

	// Botones CRUD Proveedor
	private JButton añadirRegistroButtonP = new JButton("Añadir registro");
	private JButton consultarButtonP = new JButton("Consultar por ID o nombre");
	private JButton listarButtonP = new JButton("Listar registros");
	private JButton modificarButtonP = new JButton("Modificar registro");
	private JButton borrarRegistroButtonP = new JButton("Borrar registro");

	// Botones CRUD Suministra
	private JButton añadirRegistroButtonS = new JButton("Añadir registro");
	private JButton consultarButtonS = new JButton("Consultar por ID o nombre");
	private JButton listarButtonS = new JButton("Listar registros");
	private JButton modificarButtonS = new JButton("Modificar registro");
	private JButton borrarRegistroButtonS = new JButton("Borrar registro");

	// TablasBorrar
	private JButton piezasButton = new JButton("Piezas");
	private JButton proveedoresButton = new JButton("Proveedores");
	private JButton suministranButton = new JButton("Suminstran");

	// TablasCRUD
	private JButton piezasButtonC = new JButton("Piezas");
	private JButton proveedoresButtonC = new JButton("Proveedores");
	private JButton suministranButtonC = new JButton("Suminstran");
	
	private String IDProveedor = "";
	private String nombre = "";
	private int precio;
	private int IDPiezas;

	/**
	 * interficie gràfica
	 * 
	 * @param titol
	 * @param llista
	 */
	public vistaSwing(String titol) {
		super(titol);
		this.setLayout(new BorderLayout());
		this.setSize(1200, 300);
		panellBotonsOpcions.setSize(300,300);
		botonesMenu();
		missatge();
		this.setVisible(true);
	}

	public JButton getAñadirRegistroButtonP() {
		return añadirRegistroButtonP;
	}

	public void setAñadirRegistroButtonP(JButton añadirRegistroButtonP) {
		this.añadirRegistroButtonP = añadirRegistroButtonP;
	}

	public JButton getConsultarButtonP() {
		return consultarButtonP;
	}

	public void setConsultarButtonP(JButton consultarButtonP) {
		this.consultarButtonP = consultarButtonP;
	}

	public JButton getListarButtonP() {
		return listarButtonP;
	}

	public void setListarButtonP(JButton listarButtonP) {
		this.listarButtonP = listarButtonP;
	}

	public JButton getModificarButtonP() {
		return modificarButtonP;
	}

	public void setModificarButtonP(JButton modificarButtonP) {
		this.modificarButtonP = modificarButtonP;
	}

	public JButton getBorrarRegistroButtonP() {
		return borrarRegistroButtonP;
	}

	public void setBorrarRegistroButtonP(JButton borrarRegistroButtonP) {
		this.borrarRegistroButtonP = borrarRegistroButtonP;
	}

	public JButton getAñadirRegistroButtonS() {
		return añadirRegistroButtonS;
	}

	public void setAñadirRegistroButtonS(JButton añadirRegistroButtonS) {
		this.añadirRegistroButtonS = añadirRegistroButtonS;
	}

	public JButton getConsultarButtonS() {
		return consultarButtonS;
	}

	public void setConsultarButtonS(JButton consultarButtonS) {
		this.consultarButtonS = consultarButtonS;
	}

	public JButton getListarButtonS() {
		return listarButtonS;
	}

	public void setListarButtonS(JButton listarButtonS) {
		this.listarButtonS = listarButtonS;
	}

	public JButton getModificarButtonS() {
		return modificarButtonS;
	}

	public void setModificarButtonS(JButton modificarButtonS) {
		this.modificarButtonS = modificarButtonS;
	}

	public JButton getBorrarRegistroButtonS() {
		return borrarRegistroButtonS;
	}

	public void setBorrarRegistroButtonS(JButton borrarRegistroButtonS) {
		this.borrarRegistroButtonS = borrarRegistroButtonS;
	}

	

	public String getIDProveedor() {
		return IDProveedor;
	}

	public void setIDProveedor(String iDProveedor) {
		IDProveedor = iDProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPreu() {
		return precio;
	}

	public void setPreu(int precio) {
		this.precio = precio;
	}

	public JTextArea getMensaje() {
		return mensaje;
	}

	public void setMensaje(JTextArea mensaje) {
		this.mensaje = mensaje;
	}

	public JPanel getPanellBotons() {
		return panellBotons;
	}

	public void setPanellBotons(JPanel panellBotons) {
		this.panellBotons = panellBotons;
	}

	public JPanel getPanellBotonsOpcions() {
		return panellBotonsOpcions;
	}

	public void setPanellBotonsOpcions(JPanel panellBotonsOpcions) {
		this.panellBotonsOpcions = panellBotonsOpcions;
	}

	public JButton getInicializarButton() {
		return inicializarButton;
	}

	public void setInicializarButton(JButton inicializarButton) {
		this.inicializarButton = inicializarButton;
	}

	public JButton getInsertarButton() {
		return insertarButton;
	}

	public void setInsertarButton(JButton insertarButton) {
		this.insertarButton = insertarButton;
	}

	public JButton getBorrarButton() {
		return borrarButton;
	}

	public void setBorrarButton(JButton borrarButton) {
		this.borrarButton = borrarButton;
	}

	public JButton getCrudeButton() {
		return crudeButton;
	}

	public void setCrudeButton(JButton crudeButton) {
		this.crudeButton = crudeButton;
	}

	public JButton getAñadirRegistroButton() {
		return añadirRegistroButton;
	}

	public void setAñadirRegistroButton(JButton añadirRegistroButton) {
		this.añadirRegistroButton = añadirRegistroButton;
	}

	public JButton getConsultarButton() {
		return consultarButton;
	}

	public void setConsultarButton(JButton consultarButton) {
		this.consultarButton = consultarButton;
	}

	public JButton getListarButton() {
		return listarButton;
	}

	public void setListarButton(JButton listarButton) {
		this.listarButton = listarButton;
	}

	public JButton getModificarButton() {
		return modificarButton;
	}

	public void setModificarButton(JButton modificarButton) {
		this.modificarButton = modificarButton;
	}

	public JButton getBorrarRegistroButton() {
		return borrarRegistroButton;
	}

	public void setBorrarRegistroButton(JButton borrarRegistroButton) {
		this.borrarRegistroButton = borrarRegistroButton;
	}

	public JButton getPiezasButton() {
		return piezasButton;
	}

	public void setPiezasButton(JButton piezasButton) {
		this.piezasButton = piezasButton;
	}

	public JButton getProveedoresButton() {
		return proveedoresButton;
	}

	public void setProveedoresButton(JButton proveedoresButton) {
		this.proveedoresButton = proveedoresButton;
	}

	public JButton getSuministranButton() {
		return suministranButton;
	}

	public void setSuministranButton(JButton suministranButton) {
		this.suministranButton = suministranButton;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIDPiezas() {
		return IDPiezas;
	}

	public void setIDPiezas(int iDPiezas) {
		IDPiezas = iDPiezas;
	}

	public JButton getPiezasButtonC() {
		return piezasButtonC;
	}

	public void setPiezasButtonC(JButton piezasButtonC) {
		this.piezasButtonC = piezasButtonC;
	}

	public JButton getProveedoresButtonC() {
		return proveedoresButtonC;
	}

	public void setProveedoresButtonC(JButton proveedoresButtonC) {
		this.proveedoresButtonC = proveedoresButtonC;
	}

	public JButton getSuministranButtonC() {
		return suministranButtonC;
	}

	public void setSuministranButtonC(JButton suministranButtonC) {
		this.suministranButtonC = suministranButtonC;
	}

	/**
	 * afegir botons a la interficie
	 */
	public void botonesMenu() {

		inicializarButton.setBackground(Color.pink);
		insertarButton.setBackground(Color.pink);
		borrarButton.setBackground(Color.pink);
		crudeButton.setBackground(Color.pink);

		panellBotons.setLayout(new FlowLayout());

		panellBotons.add(inicializarButton);
		panellBotons.add(insertarButton);
		panellBotons.add(borrarButton);
		panellBotons.add(crudeButton);

		this.add(panellBotons, BorderLayout.NORTH);
	}

	public void botonesMenuEnable() {

		inicializarButton.setEnabled(true);
		insertarButton.setEnabled(true);
		borrarButton.setEnabled(true);
		crudeButton.setEnabled(true);

		this.remove(panellBotonsOpcions);
	}
	
	public void borrarPanel() {
		this.remove(panellBotonsOpcions);
	}

	/**
	 * afegir botons
	 */
	public void botonesTablas() {

		piezasButton.setBackground(Color.yellow);
		proveedoresButton.setBackground(Color.yellow);
		suministranButton.setBackground(Color.yellow);

		panellBotonsOpcions.setLayout(new FlowLayout());
		panellBotonsOpcions.add(piezasButton);
		panellBotonsOpcions.add(proveedoresButton);
		panellBotonsOpcions.add(suministranButton);

		inicializarButton.setEnabled(false);
		insertarButton.setEnabled(false);
		borrarButton.setEnabled(false);
		crudeButton.setEnabled(false);

		this.add(panellBotonsOpcions, BorderLayout.SOUTH);
	}

	public void botonesTablasCRUD() {
		

		piezasButtonC.setBackground(Color.orange);
		proveedoresButtonC.setBackground(Color.orange);
		suministranButtonC.setBackground(Color.orange);

		panellBotonsOpcions.setLayout(new FlowLayout());
		panellBotonsOpcions.add(piezasButtonC);
		panellBotonsOpcions.add(proveedoresButtonC);
		panellBotonsOpcions.add(suministranButtonC);

		inicializarButton.setEnabled(false);
		insertarButton.setEnabled(false);
		borrarButton.setEnabled(false);
		crudeButton.setEnabled(false);

		this.add(panellBotonsOpcions, BorderLayout.SOUTH);
	}

	public void botonesCRUDPiezas() {
		

		añadirRegistroButton.setBackground(Color.yellow);
		consultarButton.setBackground(Color.yellow);
		listarButton.setBackground(Color.yellow);
		modificarButton.setBackground(Color.yellow);
		borrarRegistroButton.setBackground(Color.yellow);

		panellBotonsOpcions.setLayout(new FlowLayout());
		panellBotonsOpcions.add(añadirRegistroButton);
		panellBotonsOpcions.add(consultarButton);
		panellBotonsOpcions.add(listarButton);
		panellBotonsOpcions.add(modificarButton);
		panellBotonsOpcions.add(borrarRegistroButton);

		inicializarButton.setEnabled(false);
		insertarButton.setEnabled(false);
		borrarButton.setEnabled(false);
		crudeButton.setEnabled(false);

		this.add(panellBotonsOpcions, BorderLayout.SOUTH);
	}

	public void botonesCRUDProveedor() {

		añadirRegistroButtonP.setBackground(Color.gray);
		consultarButtonP.setBackground(Color.gray);
		listarButtonP.setBackground(Color.gray);
		modificarButtonP.setBackground(Color.gray);
		borrarRegistroButtonP.setBackground(Color.gray);

		panellBotonsOpcions.setLayout(new FlowLayout());
		panellBotonsOpcions.add(añadirRegistroButtonP);
		panellBotonsOpcions.add(consultarButtonP);
		panellBotonsOpcions.add(listarButtonP);
		panellBotonsOpcions.add(modificarButtonP);
		panellBotonsOpcions.add(borrarRegistroButtonP);

		inicializarButton.setEnabled(false);
		insertarButton.setEnabled(false);
		borrarButton.setEnabled(false);
		crudeButton.setEnabled(false);

		this.add(panellBotonsOpcions, BorderLayout.SOUTH);
	}

	public void botonesCRUDSuministra() {
		

		añadirRegistroButtonS.setBackground(Color.white);
		consultarButtonS.setBackground(Color.white);
		listarButtonS.setBackground(Color.white);
		modificarButtonS.setBackground(Color.white);
		borrarRegistroButtonS.setBackground(Color.white);

		panellBotonsOpcions.setLayout(new FlowLayout());
		panellBotonsOpcions.add(añadirRegistroButtonS);
		panellBotonsOpcions.add(consultarButtonS);
		panellBotonsOpcions.add(listarButtonS);
		panellBotonsOpcions.add(modificarButtonS);
		panellBotonsOpcions.add(borrarRegistroButtonS);

		inicializarButton.setEnabled(false);
		insertarButton.setEnabled(false);
		borrarButton.setEnabled(false);
		crudeButton.setEnabled(false);

		this.add(panellBotonsOpcions, BorderLayout.SOUTH);
	}

	/**
	 * missatge
	 */
	public void missatge() {
		mensaje.setEnabled(false);
		add(mensaje, BorderLayout.CENTER);

	}

	/**
	 * rebre missatge
	 * 
	 * @param a   -llista
	 * @param NIF - nif
	 * @param m   - string
	 * @return el missatge
	 */
	/*
	 * public String rebreMissatge(String NIF, String m) { return
	 * a.llistarProductesProductor(a.deNIFaProductor(NIF)); }
	 * 
	 * /** escriure missatge
	 * 
	 * @param m -stirng
	 */
	public void escriureMissatge(String m) {
		mensaje.append(m);
	}

	/**
	 * buidar missatge
	 */
	public void buidarMissatge() {
		mensaje.setText("");
	}
	
	public void añadir() {
		this.IDPiezas  = Integer.parseInt( JOptionPane.showInputDialog("Indica el ID:"));
		this.nombre  = JOptionPane.showInputDialog("Indica el nombre:");
	
	}
	
	public void añadirProveedor() {
		this.IDProveedor  = JOptionPane.showInputDialog("Indica el ID:");
		this.nombre  = JOptionPane.showInputDialog("Indica el nombre:");
	
	}
	
	public void añadirSuministra() {
		this.IDPiezas  = Integer.parseInt( JOptionPane.showInputDialog("Indica el ID Piezas:"));
		this.IDProveedor  = JOptionPane.showInputDialog("Indica el ID Proveedo:");
		this.precio  = Integer.parseInt(JOptionPane.showInputDialog("Indica el precio:"));
	
	}
	
	public void añadirIDPiezas() {
		this.IDPiezas  = Integer.parseInt( JOptionPane.showInputDialog("Indica el ID:"));
		
	}
	
	public void añadirIDProveedor() {
		this.IDProveedor  = JOptionPane.showInputDialog("Indica el ID:");	
	}
	
	public void añadirIDSuministra() {
		this.IDPiezas  = Integer.parseInt( JOptionPane.showInputDialog("Indica el ID Piezas:"));
		this.IDProveedor  = JOptionPane.showInputDialog("Indica el ID Proveedo:");
	}

}