package servicios;

import java.util.Scanner;

public class ImplMenu implements InterfaceMenu {

	@Override
	public void Menu() {
		// TODO Auto-generated method stub
		System.out.println("\n\t1. Registro empleado");
		System.out.println("\t2. Modificar empleado");
		System.out.println("\t3. Exportar a fichero");
		System.out.println("\t0. Cerrar App");

	}

}