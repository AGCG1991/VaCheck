package vacheck.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sanitario  {

    @Id
    @GeneratedValue
     private Integer IDsanitario;
   
    @OneToMany (mappedBy = "sanitario")
    private List <Consulta> consulta_sanitario;
    
    @OneToMany (mappedBy = "sanitario_cita")
    private List <CitaMedica> cita_sanitaria;
    
    public Sanitario(){ }

    public Integer getIDsanitario() {
        return IDsanitario;
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

	public void setIDsanitario(Integer iDsanitario) {
		IDsanitario = iDsanitario;
	}
    
    
}