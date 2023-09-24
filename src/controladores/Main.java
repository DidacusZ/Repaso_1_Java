package controladores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import entidades.Trabajador;
import servicios.ImplMenu;
import servicios.ImplTrabajador;
import servicios.InterfaceMenu;
import servicios.InterfaceTrabajador;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// implementaciones
		InterfaceMenu implMenu = new ImplMenu();
		InterfaceTrabajador implTrabajador = new ImplTrabajador();

		// lista
		List<Trabajador> listaTrabajadores = new ArrayList();

		// declaracion variables
		int num;
		boolean verdad = true;
		
		//fichero
		File archivoTxt = new File("ficheroTrabajadores.txt");

		try {

			do {
				implMenu.Menu();
				num = implTrabajador.CapturaEntero("Elige una opcion");				

				switch (num) {

				// registrar empleado
				case 1:
					implTrabajador.AddTrabajador(listaTrabajadores);
					break;

				// modificar empleadoo
				case 2:
					implTrabajador.ModificarTrabajador(listaTrabajadores);
					break;

				//exportar fichero
				case 3:
					implTrabajador.ExportarFichero(listaTrabajadores,archivoTxt);
					break;
				}

			} while (num != 0);

		} catch (InputMismatchException e) {
			System.out.println("\tSe produjo un error de formato: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("\n\tSe produjo un error: " + e.getMessage());
		}

		System.out.println("\n\tAdios y gracias por usar mi aplicación");

	}

}
