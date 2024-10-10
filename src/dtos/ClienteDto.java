package dtos;

public class ClienteDto {
	
	//Atributos
	String nombre="aaaaa";
	String apellidos="aaaa aaaa";
	long idCliente=0;
	
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	//COnstructores
	public ClienteDto(String nombre, String apellidos, long idCliente) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idCliente = idCliente;
	}
	public ClienteDto() {
		super();
	}
	
	

}
