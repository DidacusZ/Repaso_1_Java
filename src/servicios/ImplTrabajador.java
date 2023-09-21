package servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entidades.Trabajador;

public class ImplTrabajador implements InterfaceTrabajador {

	@Override
	public List<Trabajador> AddTrabajador(List<Trabajador> lista) {
		// TODO Auto-generated method stub-

		Trabajador empleado = new Trabajador();

		// Trabajador empleado2 = new Trabajador(1, "pepe", "botella", "12512521s",
		// "02-04-2032", "bachiller", 2134532145,"ES24151241234234");

		empleado.setId(lista.size() + 1);
		CargarTrabajador(empleado);

		// lista.add(empleado2);

		lista.add(empleado);

		return lista;
	}

	@Override
	public List<Trabajador> ModificarTrabajador(List<Trabajador> lista) {
		// TODO Auto-generated method stub

		return lista;
	}

	@Override
	public void ExportarFichero(List<Trabajador> lista) {
		// TODO Auto-generated method stub

		for (int i = 0; i < lista.size(); i++) {

			System.out.println("\t" + lista.get(i).toString());
		}

	}

	private void CargarTrabajador(Trabajador empleado) {

		/*
		 * empleado.setNombre(CapturaString("Introduce el nombre del Trabajador"));
		 * empleado.setApellidos(CapturaString("Introduce el apellido del Trabajador"));
		 * empleado.setDni(CapturaString("Introduce el DNI del Trabajador"));
		 * empleado.setFechaNacimiento(
		 * CapturaString("Introduce la fecha de nacimiento del Trabajador"));
		 * empleado.setTitulacionMasAlta(
		 * CapturaString("Introduce la titulacion mas alta del Trabajador"));
		 */
		CapturaEntero("Introduce el Nº de la Seguridad Social del Trabajador");
		// empleado.setnSS(CapturaEntero("Introduce el Nº de la Seguridad Social del
		// Trabajador"));
		// empleado.setnCuenta(CapturaString("Introduce el Nº de cuenta del
		// Trabajador"));

	}

	private String CapturaString(String txt) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t" + txt + ": ");
		return sc.next();
	}

	public int CapturaEntero(String txt) {

		int num = 0;
		Scanner teclado = new Scanner(System.in);
		
		boolean continua;
		do {
			try {
				continua = false;
				System.out.print("\n\t" + txt + ": ");
				num = teclado.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("\n\tSe produjo un error de formato: " + ex);
				teclado.next();
				continua = true;
			}
		} while (continua);

		return num;
	}

}