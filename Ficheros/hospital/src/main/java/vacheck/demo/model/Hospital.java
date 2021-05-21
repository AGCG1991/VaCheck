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
	private String Dirección;
	private String Nombre;
	private int NumeroVacunados;
	
	
	//---------------------------------------------------------------------------------------------------------
	@OneToMany (mappedBy ="hospital")																		//-
	private List<Usuario> usuarios_Hospital;																//-
	//---------------------------------------------------------------------------------------------------------
	
	public Hospital() {
		
		
	}
	
	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNumeroVacunados() {
		return NumeroVacunados;
	}

	public void setNumeroVacunados(int numeroVacunados) {
		NumeroVacunados = numeroVacunados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Dirección == null) ? 0 : Dirección.hashCode());
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
		if (Dirección == null) {
			if (other.Dirección != null)
				return false;
		} else if (!Dirección.equals(other.Dirección))
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
