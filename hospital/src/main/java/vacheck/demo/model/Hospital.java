package vacheck.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue
	private Integer id;
	private String Direccion;
	private String Nombre;
	private int NumeroVacunados;


	//---------------------------------------------------------------------------------------------------------
	@OneToMany (mappedBy ="hospital")																		//-
	private List<Usuario> usuarios_Hospital;																//-
	//---------------------------------------------------------------------------------------------------------

	public Hospital() {


	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDirección(String direccion) {
		Direccion = direccion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		if(nombre=="") {
			throw new RuntimeException("Cadena vacia no valida");
		}
		this.Nombre = nombre;
	}

	public int getNumeroVacunados() {
		return NumeroVacunados;
	}

	public void setNumeroVacunados(int numeroVacunados) {
		if(numeroVacunados<0) {
			throw new RuntimeException("El numero de vacunados debe ser positivo");
		}
		this.NumeroVacunados = numeroVacunados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Direccion == null) ? 0 : Direccion.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + NumeroVacunados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (Direccion == null) {
			if (other.Direccion != null)
				return false;
		} else if (!Direccion.equals(other.Direccion))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (NumeroVacunados != other.NumeroVacunados)
			return false;
		return true;
	}

	public void AnyadirPaciente() {

	}

	public void AnyadirMedico() {

	}

	public void EliminarPaciente() {

	}

	public void EliminarPAciente() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Usuario> getUsuarios_Hospital() {
		return usuarios_Hospital;
	}

	public void setUsuarios_Hospital(List<Usuario> usuarios_Hospital) {
		this.usuarios_Hospital = usuarios_Hospital;
	}



}
