package dto;

public class PersonaDTO 
{
	private int idPersona;
	private String nombre;
	private String telefono;
	private LocalidadDTO localidad;

	public PersonaDTO(int idPersona, String nombre, String telefono, LocalidadDTO localidad)
	{
		this.setIdPersona(idPersona);
		this.setNombre(nombre);
		this.setTelefono(telefono);
		this.setLocalidad(localidad);
	} 
	 
	public int getIdPersona()  
	{
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) 
	{
		this.idPersona = idPersona;
	}

	public String getNombre() 
	{
		return this.nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTelefono() 
	{
		return this.telefono;
	}

	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}

	public LocalidadDTO getLocalidad() {
		return localidad;
	}

	public void setLocalidad(LocalidadDTO localidad) {
		this.localidad = localidad;
	}
	
	
}
