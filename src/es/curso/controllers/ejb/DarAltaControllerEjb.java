package es.curso.controllers.ejb;

import es.curso.controllers.DarAltaController;
import es.curso.model.entity.Cliente;

public class DarAltaControllerEjb implements DarAltaController{

	@Override
	public void agregar(Cliente cliente) {
		// Logica del negocio para agregar un cliente
		//1.Verificar datos
		//2.Agregarlos-> llamar a la capa DAO para que se de alta
		//3.Enviar email al jefe de obra 
		//4 enviar un email al cliente.
		
	}

}
