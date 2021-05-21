package vacheck.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Paciente {

	@Id
	@GeneratedValue
	private Integer id;
	private String IdPaciente;
	private boolean HaFallecido;

	@ManyToMany (mappedBy = "paciente")
	private List <Consulta> consultas_paciente;
	
	public Paciente () {
		
		
	}
	
	public String getIdPaciente() {
		return IdPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		IdPaciente = idPaciente;
	}

	public boolean isHaFallecido() {
		return HaFallecido;
	}

	public void setHaFallecido(boolean haFallecido) {
		HaFallecido = haFallecido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (HaFallecido ? 1231 : 1237);
		result = prime * result + ((IdPaciente == null) ? 0 : IdPaciente.hashCode());
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
		Paciente other = (Paciente) obj;
		if (HaFallecido != other.HaFallecido)
			return false;
		if (IdPaciente == null) {
			if (other.IdPaciente != null)
				return false;
		} else if (!IdPaciente.equals(other.IdPaciente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente " + IdPaciente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Consulta> getConsultas_paciente() {
		return consultas_paciente;
	}

	public void setConsultas_paciente(List<Consulta> consultas_paciente) {
		this.consultas_paciente = consultas_paciente;
	}
	
	
}
