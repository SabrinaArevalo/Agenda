package dto;

public class DomicilioDTO {
		private String calle; 
		private Integer altura; 
		private Integer piso; 
		private Integer depto; 
		private String localidad; 
		
		public DomicilioDTO(String calle, int altura,int piso,int depto, String localidad)
		{
			this.calle = calle;
			this.altura = altura;
			this.piso = piso;
			this.depto= depto;
			this.localidad= localidad; 

		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public Integer getAltura() {
			return altura;
		}

		public void setAltura(Integer altura) {
			this.altura = altura;
		}

		public Integer getPiso() {
			return piso;
		}

		public void setPiso(Integer piso) {
			this.piso = piso;
		}

		public Integer getDepto() {
			return depto;
		}

		public void setDepto(Integer depto) {
			this.depto = depto;
		}

		public String getLocalidad() {
			return localidad;
		}

		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}
		
}
