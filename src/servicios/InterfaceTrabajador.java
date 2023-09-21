package servicios;

import java.util.List;

import entidades.Trabajador;

public interface InterfaceTrabajador {

	//añade un trabajdor
	List <Trabajador> AddTrabajador (List <Trabajador> lista);
	
	//modifica un trabajador
	List <Trabajador> ModificarTrabajador (List <Trabajador> lista);
	
	//exporta la lista a un fichero
	void ExportarFichero (List <Trabajador> lista);	

	int CapturaEntero(String txt);
}
