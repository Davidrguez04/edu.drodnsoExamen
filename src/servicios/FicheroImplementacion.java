package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/*David Rodriguez Alonso
 * 10/10/2024
 * Clase que contiene los métodos para la creación del fichero log 
 * */
 
public class FicheroImplementacion implements FicheroInterfaz{

	//Método que crea un fichero log para meterles las opciones que va introduciendo el usuario
	public void crearFicheroLog(String mensaje) {
		
		String rutaFichero="C:\\Users\\csi22\\eclipse-workspace\\edu.drodnso\\auditoria\\log-fichero.txt";
		
		try {
			FileWriter fw=new FileWriter(rutaFichero, true);
			fw.write(mensaje+"\n");
			fw.close();
			
		}catch(IOException e) {
			System.out.println("No se ha podido crear el fichero log");
			e.getStackTrace();
		}
	}
}
