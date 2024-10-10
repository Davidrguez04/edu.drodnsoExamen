package servicios;

import java.util.Scanner;

/*David Rodriguez Alonso
 * 10/10/2024
 * Clase que contiene los métodos para la creación de los menús de la aplicación  
 * */
public class MenuImplementacion implements MenuInterfaz{
	Scanner sc=new Scanner(System.in);
	
	//Método para el menú principal de la app, ,muestra y recoge la opción 
	public int mostrarMenu() {
		int opcion=0;
		System.out.println("Menú principal");
		System.out.println("1.-Menú empleado");
		System.out.println("2.-Menú gerencia");
		System.out.println("0.-Salir del menú");
		System.out.println("Seleccione una opción: ");
		 opcion=sc.nextInt();
		 
		 return opcion;
	}
	
	//Método de la parte empleado en el que recoge la opcion que quiere ejecutar el usuario
	public int menuEmpleado() {
		int opcion=0;
		System.out.println("Menú Empleado");
		System.out.println("1.-Calculo total de ventas mensual");
		System.out.println("2.-Añadir compras a un cliente");
		System.out.println("Seleccione una opción: ");
		 opcion=sc.nextInt();
		 
		 return opcion;
	}
	
	//Método de la parte gerencia en el que recoge una opcion para crear un nuevo cliente
	public int menuGerencia() {
		int opcion=0;
		System.out.println("Menú Gerencia");
		System.out.println("1.-Crear un nuevo cliente");
		System.out.println("Seleccione una opción: ");
		 opcion=sc.nextInt();
		 
		 return opcion;
	}

}
