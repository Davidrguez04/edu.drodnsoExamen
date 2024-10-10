package dtos;

import java.time.LocalDateTime;

public class VentasDto {
	
	//Atributos
		double importe=0.0;
		LocalDateTime fchVenta=LocalDateTime.now();
		long idVenta;
		//Getters y setters
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public LocalDateTime getFchVenta() {
			return fchVenta;
		}
		public void setFchVenta(LocalDateTime fchVenta) {
			this.fchVenta = fchVenta;
		}
		public long getIdVenta() {
			return idVenta;
		}
		public void setIdVenta(long idVenta) {
			this.idVenta = idVenta;
		}
		
		
		//COnstructores
		public VentasDto(double importe, LocalDateTime fchVenta, long idVenta) {
			super();
			this.importe = importe;
			this.fchVenta = fchVenta;
			this.idVenta = idVenta;
		}
		public VentasDto() {
			super();
		}
		
		

}
