package servicios;

import java.util.Scanner;

public class ImplMenu implements InterfaceMenu {

	@Override
	public int Menu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t1. Registro empleado");
		System.out.println("\t2. Modificar empleado");
		System.out.println("\t3. Exportar a fichero");
		System.out.println("\t0. Cerrar App");
		System.out.print("\n\tElige una opcion: ");
		
		return sc.nextInt();
	}

}