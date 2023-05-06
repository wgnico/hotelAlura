package jdbc.modelo;

import java.sql.Date;

public class Huespedes {
	
	private Integer Id;
	private String Nombre;
	private String Apellido;
	private Date FechaNac;
	private String Nacionalidad;
	private String Telefono;
	private Integer IdReserva;
	
	
	public Huespedes(String nombre, String apellido, Date fechaNac, String nacionalidad, String telefono,
			Integer idReserva) {
		super();		
		Nombre = nombre;
		Apellido = apellido;
		FechaNac = fechaNac;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		IdReserva = idReserva;
	}
	
	public Huespedes(Integer id, String nombre, String apellido, Date fechaNac, String nacionalidad,
			String telefono, Integer idReserva) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		FechaNac = fechaNac;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		IdReserva = idReserva;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Date getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Integer getIdReserva() {
		return IdReserva;
	}

	public void setIdReserva(Integer idReserva) {
		IdReserva = idReserva;
	}



	
}
