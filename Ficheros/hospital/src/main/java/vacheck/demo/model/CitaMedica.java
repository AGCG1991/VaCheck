package vacheck.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;


@Entity
public class CitaMedica {
	@Id
	@GeneratedValue
	private Integer IdCita; // Identificador unico de la cita
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date fechaCita;
	private String hospitalAsignado;

	// Método constructor

	@ManyToOne 
	private Paciente paciente;
	
	@ManyToOne
	private Sanitario sanitario_cita;
	
	@OneToOne
	private Consulta consulta_medica;
	
	public CitaMedica() {

	}

	// Métodos getter y setter

	public Integer getIdCita() {
		return IdCita;
	}

	public void setIdCita(Integer idCita) {
		IdCita = idCita;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	// Equals y hash code que tiene en cuenta el Id de la cita para comparar

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CitaMedica that = (CitaMedica) o;
		return Objects.equals(IdCita, that.IdCita);
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCita);
	}

	// Método toString para mostrar los datos de la cita

	@Override
	public String toString() {
		return "Cita: " + IdCita;
	}

//	public void AltaCita(int anyo, int mes, int dia, int hr, int min) {
//		fechaCita = new Date(anyo, mes, dia, hr, min);
//	}

	public void BajaCita() {
		fechaCita = null;
	}

	public void ActualizarCita(Date f) {
		fechaCita = f;
	}

	public String getHospitalAsignado() {
		return hospitalAsignado;
	}

	public void setHospitalAsignado(String hospitalAsignado) {
		this.hospitalAsignado = hospitalAsignado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Sanitario getSanitario_cita() {
		return sanitario_cita;
	}

	public void setSanitario_cita(Sanitario sanitario_cita) {
		this.sanitario_cita = sanitario_cita;
	}

	public Consulta getConsulta_medica() {
		return consulta_medica;
	}

	public void setConsulta_medica(Consulta consulta_medica) {
		this.consulta_medica = consulta_medica;
	}



}
