package sistemasInteligentes;

public class Usuario {
	
	//Atributos
	private String nombre,sexo,calle,municipio,email,contraseña;
	private int edad,telefono,codigoPostal;
	private boolean estaVacunado;
	
	
	//constructor
	public Usuario() {
		
	}
	//--------------------------------------------------------
	
	//getters and setter
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public void setEstaVacunado(boolean estaVacunado) {
		this.estaVacunado = estaVacunado;
	}
	//--------------------------------------------------------------------

	//equals equals----------------------------------------------------
	@Override
	public boolean equals(Object obj) {
		boolean ok = false;
		if(obj instanceof Usuario) {
			Usuario u= (Usuario) obj;
			ok = this.email.equalsIgnoreCase(u.email);
		}
		return ok;
	}
	
	public int hashCode() {
		return email.toLowerCase().hashCode();
	}
	//-------------------------------------------------------------------------//
	
	
	
}
