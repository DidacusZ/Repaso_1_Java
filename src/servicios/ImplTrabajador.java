package servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entidades.Trabajador;

public class ImplTrabajador implements InterfaceTrabajador {

	@Override
	public List<Trabajador> AddTrabajador(List<Trabajador> lista) {
		// TODO Auto-generated method stub-

		Trabajador empleado2 = new Trabajador(1, "pepe", "botella", "12512521s", "02-04-2032", "bachiller", 2134532145,
				"ES24151241234234");

		Trabajador empleado3 = new Trabajador(2, "asdasd", "botella", "12512521s", "02-04-2032", "bachiller",
				2134532145, "ES24151241234234");

		lista.add(empleado2);
		lista.add(empleado3);

		/*
		 * Trabajador empleado = new Trabajador(); empleado.setId(lista.size() + 1);//id
		 * = tamaño lista + 1 CargarTrabajador(empleado);// rellena el resto de los
		 * datos lista.add(empleado);
		 */

		return lista;
	}

	@Override
	public List<Trabajador> ModificarTrabajador(List<Trabajador> lista) {
		// TODO Auto-generated method stub

		System.out.println("\n");
		for (int i = 0; i < lista.size(); i++)
			System.out.println("\t" + lista.get(i).toString());

		int id = CapturaEntero("Introduce el ID del Trabajador que quieres modificar") - 1;

		Trabajador emplModif = lista.get(id);
		int opcion = 0;

		do {
			MenuMod();
			opcion = CapturaEntero("Elige una opcion");

			switch (opcion) {

			case 1:// nombre
				emplModif.setNombre(CapturaString("Introduce el nombre del Trabajador"));
				break;

			case 2:// apellidos
				emplModif.setApellidos(CapturaString("Introduce el apellido del Trabajador"));
				break;

			case 3:// DNI
				emplModif.setDni(CapturaString("Introduce el DNI del Trabajador"));
				break;

			case 4:// fecha nacimiento
				emplModif.setFechaNacimiento(CapturaString("Introduce la fecha de nacimiento del Trabajador"));
				break;

			case 5:// Titulacion mas alta
				emplModif.setTitulacionMasAlta(CapturaString("Introduce la titulacion mas alta del Trabajador"));
				break;

			case 6:// Numero de la Seguridad Social
				emplModif.setnSS(CapturaEntero("Introduce el Nº de la Seguridad Social del Trabajador"));
				break;

			// Numero de cuenta
			case 7:
				emplModif.setnCuenta(CapturaString("Introduce el Nº de cuenta del Trabajador"));
				break;

			case 8:// todos
				CargarTrabajador(emplModif);
				break;
			}

		} while (opcion != 0);

		return lista;
	}

	@Override
	public void ExportarFichero(List<Trabajador> lista,File archivoTxt) {
		// TODO Auto-generated method stub

		for (int i = 0; i < lista.size(); i++) {

			System.out.println("\t" + lista.get(i).toString());
		}

		// guadar datos en el fichero

		FileWriter fichero = null;

		try {

			fichero = new FileWriter(archivoTxt, true);//ruta

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		try {
			PrintWriter escribir = new PrintWriter(fichero);// para escribir en fichero

			escribir.println("id,nombre;apellidos;DNI;fecha nacimiento;titulacion mas alta;numero cuenta");

			for (int i = 0; i < lista.size(); i++) {

				escribir.println(lista.get(i).toString());
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (null != fichero)
					fichero.close();
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("\n\tDatos guardados con exito");

	}

	private void CargarTrabajador(Trabajador empleado) {

		empleado.setNombre(CapturaString("Introduce el nombre del Trabajador"));
		empleado.setApellidos(CapturaString("Introduce el apellido del Trabajador"));
		empleado.setDni(CapturaString("Introduce el DNI del Trabajador"));
		empleado.setFechaNacimiento(CapturaString("Introduce la fecha de nacimiento del Trabajador"));
		empleado.setTitulacionMasAlta(CapturaString("Introduce la titulacion mas alta del Trabajador"));
		empleado.setnSS(CapturaEntero("Introduce el Nº de la Seguridad Social del Trabajador"));
		empleado.setnCuenta(CapturaString("Introduce el Nº de cuenta del Trabajador"));

	}

	private String CapturaString(String txt) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t" + txt + ": ");
		return sc.next();
	}

	private void MenuMod() {

		System.out.println("\n¿Que quieres modificar?");
		System.out.println("\t1. Nombre");
		System.out.println("\t2. Apellidos");
		System.out.println("\t3. DNI");
		System.out.println("\t4. Fecha de nacimiento");
		System.out.println("\t5. Titulacion mas alta");
		System.out.println("\t6. Numero de la Seguridad Social");
		System.out.println("\t7. Numero de cuenta");
		System.out.println("\t8. todos");
		System.out.println("\t0. volver al menu");
	}

	public int CapturaEntero(String txt) {

		int num = 0;
		Scanner teclado = new Scanner(System.in);

		boolean continua;
		do {

			try {
				continua = false;
				System.out.print("\n\t" + txt + ": ");
				num = teclado.nextInt();// captura el entero

			} catch (InputMismatchException ex) {
				System.out.println("\n\tSe produjo un error de formato: " + ex);
				teclado.next();// captura string
				continua = true;
			}

		} while (continua);

		return num;
	}


}