package vacheck.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Sanitario {

	@Id
	@GeneratedValue
	private Integer IdSanitario;
	private String nombre, apellido;

	@OneToMany (mappedBy = "sanitario")
	private List <Consulta> consulta_sanitario;

	@OneToMany (mappedBy = "sanitario_cita")
	private List <CitaMedica> cita_sanitaria;

	public Sanitario() {


	}

	public Integer getIdSanitario() {
		return IdSanitario;
	}

	public void setIdSanitario(Integer idSanitario) {
		IdSanitario = idSanitario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Consulta> getConsulta_sanitario() {
		return consulta_sanitario;
	}

	public void setConsulta_sanitario(List<Consulta> consulta_sanitario) {
		this.consulta_sanitario = consulta_sanitario;
	}

	public List<CitaMedica> getCita_sanitaria() {
		return cita_sanitaria;
	}

	public void setCita_sanitaria(List<CitaMedica> cita_sanitaria) {
		this.cita_sanitaria = cita_sanitaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IdSanitario == null) ? 0 : IdSanitario.hashCode());
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
		Sanitario other = (Sanitario) obj;
		if (IdSanitario == null) {
			if (other.IdSanitario != null)
				return false;
		} else if (!IdSanitario.equals(other.IdSanitario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sanitario [IdSanitario=" + IdSanitario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", consulta_sanitario=" + consulta_sanitario + ", cita_sanitaria=" + cita_sanitaria + "]";
	}



}