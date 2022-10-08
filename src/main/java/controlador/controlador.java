package controlador;

import controladorPieza.*;
import controladorProveedor.*;
import controladorSuministra.*;
import modelo.modelo;
import vista.vista;
import vista.vistaSwing;

/**
 * @author Andrea
 *
 */

public class controlador {

	private vistaSwing ventana;

	vistaSwing vistaSwing = new vistaSwing("MVC");
	vista vista = new vista();
	modelo model = new modelo();

	public controlador() {

		// Acciones de boton del menu inicial

		CrearDBAction crearButton = new CrearDBAction(vistaSwing, vista.correctQuery("Insert"));
		vistaSwing.getInicializarButton().addActionListener(crearButton);

		InsertarAction insertarButton = new InsertarAction(vistaSwing, vista.correctQuery("Insertado"));
		vistaSwing.getInsertarButton().addActionListener(insertarButton);

		TablasAction borrarButton = new TablasAction(vistaSwing);
		vistaSwing.getBorrarButton().addActionListener(borrarButton);

		// Botones borrar tabla

		BorrarTabla borrarPiezasB = new BorrarTabla(vistaSwing, vista.correctQuery("Piezas Borrado"), 1);
		vistaSwing.getPiezasButton().addActionListener(borrarPiezasB);

		BorrarTabla borrarProveedorB = new BorrarTabla(vistaSwing, vista.correctQuery("Proveedor Borrado"), 2);
		vistaSwing.getProveedoresButton().addActionListener(borrarProveedorB);

		BorrarTabla borrarSuministraB = new BorrarTabla(vistaSwing, vista.correctQuery("Suministra Borrado"), 3);
		vistaSwing.getSuministranButton().addActionListener(borrarSuministraB);

		// Seleccion CRUD

		TablasCRUDAction CrudButton = new TablasCRUDAction(vistaSwing);
		vistaSwing.getCrudeButton().addActionListener(CrudButton);

		SeleccionarTabla piezasB = new SeleccionarTabla(vistaSwing);
		vistaSwing.getPiezasButtonC().addActionListener(piezasB);

		SeleccionarTablaProveedor proveedorB = new SeleccionarTablaProveedor(vistaSwing);
		vistaSwing.getProveedoresButtonC().addActionListener(proveedorB);

		SeleccionarTablaSuministra suministraB = new SeleccionarTablaSuministra(vistaSwing);
		vistaSwing.getSuministranButtonC().addActionListener(suministraB);

		// CRUD Piezas

		PiezasAñadirAction añadirP = new PiezasAñadirAction(vistaSwing);
		vistaSwing.getAñadirRegistroButton().addActionListener(añadirP);

		PiezasConsultarAction consultarP = new PiezasConsultarAction(vistaSwing);
		vistaSwing.getConsultarButton().addActionListener(consultarP);

		PiezasListarAction listarP = new PiezasListarAction(vistaSwing);
		vistaSwing.getListarButton().addActionListener(listarP);

		PiezasModificarAction modificarP = new PiezasModificarAction(vistaSwing);
		vistaSwing.getModificarButton().addActionListener(modificarP);

		PiezasBorrarAction borrarP = new PiezasBorrarAction(vistaSwing);
		vistaSwing.getBorrarRegistroButton().addActionListener(borrarP);

		// CRUD Proveedor

		ProveedorAñadirAction añadirProveedor = new ProveedorAñadirAction(vistaSwing);
		vistaSwing.getAñadirRegistroButtonP().addActionListener(añadirProveedor);

		ProveedorConsultarAction consultarProveedor = new ProveedorConsultarAction(vistaSwing);
		vistaSwing.getConsultarButtonP().addActionListener(consultarProveedor);

		ProveedorListarAction listarProveedor = new ProveedorListarAction(vistaSwing);
		vistaSwing.getListarButtonP().addActionListener(listarProveedor);

		ProveedorModificarAction modificarProveedor = new ProveedorModificarAction(vistaSwing);
		vistaSwing.getModificarButtonP().addActionListener(modificarProveedor);

		ProveedorBorrarAction borrarProveedor = new ProveedorBorrarAction(vistaSwing);
		vistaSwing.getBorrarRegistroButtonP().addActionListener(borrarProveedor);

		// CRUD Suministra

		SuministraAñadirAction añadirSuministr = new SuministraAñadirAction(vistaSwing);
		vistaSwing.getAñadirRegistroButtonS().addActionListener(añadirSuministr);

		SuministraConsultarAction consultarSuministr = new SuministraConsultarAction(vistaSwing);
		vistaSwing.getConsultarButtonS().addActionListener(consultarSuministr);

		SuministraListarAction listarSuministr = new SuministraListarAction(vistaSwing);
		vistaSwing.getListarButtonS().addActionListener(listarSuministr);

		SuministraModificarAction modificarSuministr = new SuministraModificarAction(vistaSwing);
		vistaSwing.getModificarButtonS().addActionListener(modificarSuministr);

		SuministraBorrarAction borrarSuministr = new SuministraBorrarAction(vistaSwing);
		vistaSwing.getBorrarRegistroButtonS().addActionListener(borrarSuministr);

	}

}
