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

	private int CapturaEntero(String txt) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("\n\t" + txt + ": ");

		} catch (InputMismatchException e) {
			System.out.println("\tSe produjo un error de formato: " + e.getMessage());
		}

		return sc.nextInt();
	}

}