package util;

import java.util.List;
import dtos.VentasDto;
import dtos.ClienteDto;


public class utilidades {
	
	//Método que genera un autoid para los clientes
	public static long idCliente(List<ClienteDto>listaClientes) {
		
		long id;
		int tamanio=listaClientes.size();
		
		if(tamanio>0) {
			id=listaClientes.get(tamanio-1).getIdCliente()+1;
		}
		else {
			id=0;
		}
		return id;
		
	}
	
	//Método que genera un autoid para cada nueva venta
public static long idVentas(List<VentasDto>listaVentas) {
		
		long id;
		int tamanio=listaVentas.size();
		
		if(tamanio>0) {
			id=listaVentas.get(tamanio-1).getIdVenta()+1;
		}
		else {
			id=0;
		}
		return id;
		
	}

}
