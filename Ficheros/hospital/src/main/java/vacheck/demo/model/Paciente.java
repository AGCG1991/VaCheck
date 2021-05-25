package vacheck.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
public class Paciente {

	@Id
	@GeneratedValue
	private Integer id;
	private String nombre, apellido;
	private boolean HaFallecido;

	@ManyToMany (mappedBy = "paciente")
	private List <Consulta> consultas_paciente;

	@OneToMany(mappedBy = "paciente")
	private List <CitaMedica> citas_paciente;
	
	public Paciente () {
		
		
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

	public boolean isHaFallecido() {
		return HaFallecido;
	}

	public void setHaFallecido(boolean haFallecido) {
		HaFallecido = haFallecido;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Paciente paciente = (Paciente) o;
		return HaFallecido == paciente.HaFallecido && Objects.equals(id, paciente.id) && Objects.equals(consultas_paciente, paciente.consultas_paciente) && Objects.equals(citas_paciente, paciente.citas_paciente);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, HaFallecido, consultas_paciente, citas_paciente);
	}

	@Override
	public String toString() {
		return "Paciente " + id;
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
