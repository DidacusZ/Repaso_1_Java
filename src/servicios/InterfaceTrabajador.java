package servicios;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import entidades.Trabajador;

public interface InterfaceTrabajador {

	//añade un trabajdor
	List <Trabajador> AddTrabajador (List <Trabajador> lista);
	
	//modifica un trabajador
	List <Trabajador> ModificarTrabajador (List <Trabajador> lista);
	
	//exporta la lista a un fichero
	void ExportarFichero (List <Trabajador> lista,File archivoTxt);	

	//captura unicamente enteros(int)
	int CapturaEntero(String txt);
}
