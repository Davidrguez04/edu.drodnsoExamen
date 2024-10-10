package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;

/*David Rodriguez Alonso
 * 10/10/2024
 * Clase que contiene el flujo principal de la aplicación donde se ejecutan
 * todos los metódos y procesos realizados 
 * 
 */
public class Inicio {

	/*David Rodriguez Alonso
	 * 10/10/2024
	 * Método principal de nuestra aplicación ya que ejecuta los métodos realizados
	 * y ordena toda la app
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterfaz menu=new MenuImplementacion();
		OperativaInterfaz operativa=new OperativaImplementacion();
		FicheroInterfaz ficheros=new FicheroImplementacion();
		
		List<VentasDto>listaVentas=new ArrayList<VentasDto>();
		List<ClienteDto>listaClientes=new ArrayList<ClienteDto>();
		
		int opcionSelecc;
		boolean salirMenu=false;
		
		while(!salirMenu) {
			opcionSelecc=menu.mostrarMenu();
			
			switch(opcionSelecc) {
			case 0:
				salirMenu=true;
				ficheros.crearFicheroLog("Opción introducida salir de la aplicación!!");
				break;
				
			case 1:
				ficheros.crearFicheroLog("Ha pulsado la opción Empleado");
				opcionSelecc=menu.menuEmpleado();
				switch(opcionSelecc) {
				case 1:
					ficheros.crearFicheroLog("Opción introducida cálculo total de ventas mensuales");
					operativa.ventasMensuales(listaVentas);
					break;
				case 2:
					ficheros.crearFicheroLog("Opción introducida añadir compras a un cliente");
					operativa.anadirCompraCliente(listaVentas);
					break;
				default:
					System.out.println("Opción introducida incorrecta!!!");
					ficheros.crearFicheroLog("Opcion introducida fuera de rango!!!");
					break;
				}
			break;
			case 2:
				ficheros.crearFicheroLog("Ha pulsado la opción Gerencia");
				opcionSelecc=menu.menuGerencia();
				switch(opcionSelecc) {
				case 1:
					ficheros.crearFicheroLog("Opción introducida crear nuevo cliente");
					operativa.crearCliente(listaClientes);
					break;
				default:
					System.out.println("Opción introducida incorrecta!!!");
					ficheros.crearFicheroLog("Opcion introducida fuera de rango!!!");
					break;
				}
				break;
				
			default:
				System.out.println("Opción introducida incorrecta!!!");
				ficheros.crearFicheroLog("Opcion introducida fuera de rango!!!");
				break;
				
			}
			
		}
		
		
		
		
		
		

	}

	
	
	
	
}
