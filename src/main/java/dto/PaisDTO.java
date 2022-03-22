package dto;

public class PaisDTO {
	private int idPais; 
	private String nombre; 
	private ProvinciaDTO provincia; 

	
	public PaisDTO(Integer idPais, String nombre, ProvinciaDTO provincia) {
		this.idPais=idPais; 
		this.nombre=nombre; 
		this.provincia= provincia; 
	}


	public int getIdPais() {
		return idPais;
	}


	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ProvinciaDTO getProvincia() {
		return provincia;
	}


	public void setProvincia(ProvinciaDTO provincia) {
		this.provincia = provincia;
	}
	
}
