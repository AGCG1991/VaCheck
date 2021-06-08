package vacheck.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;


@Entity
public class Consulta {
	@Id
	@GeneratedValue
	private Integer id;
	private String IdConsultaMedica;
	private String CitaMedica;
	private String Enfermedad;
	private String Diagnostico;
	private String VacunaId;

	@ManyToMany
	private List<Paciente> paciente;


	@ManyToOne
	private Sanitario sanitario;

	@OneToOne (mappedBy = "consulta_medica")
	private CitaMedica cita_medica;

	public Consulta() {

	}

	public void AltaConsulta() {

	}



	public String getIdConsultaMedica() {
		return IdConsultaMedica;
	}

	public void setIdConsultaMedica(String idConsultaMedica) {

		if(idConsultaMedica=="") {

			throw new RuntimeException("Cadena vacia no valida");
		}else {
			IdConsultaMedica = idConsultaMedica;
		}
	}

	public String getCitaMedica() {
		return CitaMedica;
	}

	public void setCitaMedica(String citaMedica) {

		if(citaMedica=="") {

			throw new RuntimeException("Cadena vacia no valida");
		}else {

			CitaMedica = citaMedica;
		}
	}

	public String getEnfermedad() {
		return Enfermedad;
	}

	public void setEnfermedad(String enfermedad) {


		if(enfermedad=="") {

			throw new RuntimeException("Cadena vacia no valida");
		}else {
			Enfermedad = enfermedad;
		}
	}

	public String getDiagnostico() {
		return Diagnostico;
	}

	public void setDiagnostico(String diagnostico) {

		if(diagnostico=="") {

			throw new RuntimeException("Cadena vacia no valida");
		}else {
			Diagnostico = diagnostico;
		}
	}

	public String getVacunaId() {
		return VacunaId;
	}

	public void setVacunaId(String vacunaId) {

		if(vacunaId=="") {

			throw new RuntimeException("Cadena vacia no valida");
		}else {
			VacunaId = vacunaId;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CitaMedica == null) ? 0 : CitaMedica.hashCode());
		result = prime * result + ((Diagnostico == null) ? 0 : Diagnostico.hashCode());
		result = prime * result + ((Enfermedad == null) ? 0 : Enfermedad.hashCode());
		result = prime * result + ((IdConsultaMedica == null) ? 0 : IdConsultaMedica.hashCode());
		result = prime * result + ((VacunaId == null) ? 0 : VacunaId.hashCode());
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
		Consulta other = (Consulta) obj;
		if (CitaMedica == null) {
			if (other.CitaMedica != null)
				return false;
		} else if (!CitaMedica.equals(other.CitaMedica))
			return false;
		if (Diagnostico == null) {
			if (other.Diagnostico != null)
				return false;
		} else if (!Diagnostico.equals(other.Diagnostico))
			return false;
		if (Enfermedad == null) {
			if (other.Enfermedad != null)
				return false;
		} else if (!Enfermedad.equals(other.Enfermedad))
			return false;
		if (IdConsultaMedica == null) {
			if (other.IdConsultaMedica != null)
				return false;
		} else if (!IdConsultaMedica.equals(other.IdConsultaMedica))
			return false;
		if (VacunaId == null) {
			if (other.VacunaId != null)
				return false;
		} else if (!VacunaId.equals(other.VacunaId))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {

		if(id<0) {

			throw new RuntimeException("No se admiten numeros negativos");
		}else {
			this.id = id;
		}
	}

	public List<Paciente> getPaciente() {
		return paciente;
	}

	public void setPaciente(List<Paciente> paciente) {
		this.paciente = paciente;
	}

	public Sanitario getSanitario() {
		return sanitario;
	}

	public void setSanitario(Sanitario sanitario) {
		this.sanitario = sanitario;
	}

	public CitaMedica getCita_medica() {
		return cita_medica;
	}

	public void setCita_medica(CitaMedica cita_medica) {
		this.cita_medica = cita_medica;
	}



}
