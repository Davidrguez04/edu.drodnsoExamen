package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.utilidades;
import dtos.ClienteDto;
import dtos.VentasDto;

/*David Rodriguez Alonso
 * 10/10/2024
 * Clase que contiene los métodos de la operativa de la aplicación
 * donde estarán métodos como añadir compra clientey mas para las opciones del menú  
 * */

public class OperativaImplementacion implements OperativaInterfaz{
	Scanner sc=new Scanner(System.in);
	
	//Método que añade una nueva compra de un cliente introduciendo el importe y el ide del cliente
	public void anadirCompraCliente(List<VentasDto>listaVentas) {
		
        VentasDto ventas =new VentasDto();
		
		long idVenta=utilidades.idVentas(listaVentas);
		
		System.out.println("Introduzca el importe de la nueva compra: ");
		double importeCompra=sc.nextDouble();
		
		System.out.println("Introduzca el id del cliente: ");
		long id=sc.nextLong();
		
		ventas.setImporte(importeCompra);
		ventas.setIdVenta(idVenta);
		listaVentas.add(ventas);
		
	}
	
	//Método que calcula las ventas totales mensuales sumando todos los importes que hay en un mes específico
	public void ventasMensuales(List<VentasDto>listaVentas) {
		
		System.out.println("Introduzca una fecha de dia(MM-yyyy): ");
		String fechaDia=sc.next();
		
		double importeTotal=0.0;
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-yyyy");
		List<LocalDateTime> fechasVentas = new ArrayList<LocalDateTime>();
		
		for(VentasDto ventas: listaVentas) {
			if(ventas.getFchVenta().format(formato).equals(fechaDia)) {
				importeTotal+=ventas.getImporte();
			}
		}
		
		System.out.println("Importe total: "+importeTotal);
	}
	
	//Método que crea un nuevo cliente con el nombre y apellidos, y generando un id a cada cliente nuevo.
	public void crearCliente(List<ClienteDto>listaClientes) {
		ClienteDto cliente=new ClienteDto();
		
		System.out.println("Introduzca el nombre del nuevo cliente: ");
		String nombre=sc.next();
		
		System.out.println("Introduzca los apellidos: ");
		String apellidos=sc.next();
		
		long idCLiente=utilidades.idCliente(listaClientes);
		
		cliente.setApellidos(apellidos);
		cliente.setNombre(nombre);
		cliente.setIdCliente(idCLiente);
		listaClientes.add(cliente);
		
	}

	
	
}
