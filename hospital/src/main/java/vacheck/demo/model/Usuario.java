package vacheck.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Usuario {

	// Atributos
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre, sexo, calle, municipio, email, contrasenya;
	private int edad, telefono, codigoPostal;
	private boolean estaVacunado;
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private Date fechaDeNacimiento;
	
	//-------------------------------------------------------------------------------
	@ManyToOne
	private Hospital hospital;
	@ManyToOne
	private Vacuna vacuna;
	
	//-------------------------------------------------------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		if(contrasenya.length()<8) {
			throw new RuntimeException("Minimo de 8 caracteres para la contraseña");
		}
		this.contrasenya = contrasenya;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public String getCalle() {
		return calle;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getEmail() {
		return email;
	}

	public int getEdad() {
		return edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public boolean isEstaVacunado() {
		return estaVacunado;
	}

	// constructor
	public Usuario() {
		this.estaVacunado=false;
	}
	// --------------------------------------------------------

	// getters and setter

	public void setNombre(String nombre) {
		if(nombre=="") {
			throw new RuntimeException("Cadena vacia no valida");
		}
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
	// --------------------------------------------------------------------

	// equals equals----------------------------------------------------
	@Override
	public boolean equals(Object obj) {
		boolean ok = false;
		if (obj instanceof Usuario) {
			Usuario u = (Usuario) obj;
			ok = this.id == u.id;
		}
		return ok;
	}

	public int hashCode() {
		return email.toLowerCase().hashCode();
	}
	// -------------------------------------------------------------------------//

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	

}
