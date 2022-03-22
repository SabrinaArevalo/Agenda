package dto;

public class ProvinciaDTO {
	private Integer idProvincia; 
	private String nombre; 
	private LocalidadDTO localidad; 

	
	public ProvinciaDTO(int idProvincia, String nombre, LocalidadDTO localidad) {
		this.idProvincia=idProvincia; 
		this.nombre= nombre; 
		this.localidad=localidad; 
	}

	public Integer getIdProvincia() {
		return idProvincia;
	}


	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalidadDTO getLocalidad() {
		return localidad;
	}


	public void setLocalidad(LocalidadDTO localidad) {
		this.localidad = localidad;
	}
}

