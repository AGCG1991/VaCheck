package trabajo.vacheck.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class CitaMedica {

    @Id
    @GeneratedValue
    private Integer IdCita; //Identificador unico de la cita
    private Date fechaCita;
    private String hospitalAsignado;

    //Método constructor

    public CitaMedica(){

    }

    //Métodos getter y setter

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int idCita) {
        IdCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    //Equals y hash code que tiene en cuenta el Id de la cita para comparar

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitaMedica that = (CitaMedica) o;
        return Objects.equals(IdCita, that.IdCita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdCita);
    }

    //Método toString para mostrar los datos de la cita


    @Override
    public String toString() {
        return "CitaMedica{" +
                "IdCita='" + IdCita + '\'' +
                ", fechaCita=" + fechaCita +
                ", hospitalAsignado='" + hospitalAsignado + '\'' +
                '}';
    }

    public void AltaCita(int anyo, int mes, int dia, int hr, int min){
        fechaCita = new Date(anyo, mes, dia, hr, min);
    }

    public void BajaCita(){
        fechaCita = null;
    }

    public void ActualizarCita(Date f){
        fechaCita = f;
    }

}
