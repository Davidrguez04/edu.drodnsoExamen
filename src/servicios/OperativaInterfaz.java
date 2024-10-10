package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentasDto;
import util.utilidades;

/*David Rodriguez Alonso
 * 10/10/2024
 * Interfaz que contiene los métodos de la operativa de la aplicación
 * donde estarán métodos como añadir compra clientey mas para las opciones del menú  
 * */

public interface OperativaInterfaz {
	

    public void anadirCompraCliente(List<VentasDto>listaVentas); 
	
	public void ventasMensuales(List<VentasDto>listaVentas); 
			
	
	public void crearCliente(List<ClienteDto>listaClientes); 

}
