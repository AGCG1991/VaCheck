package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vacheck.demo.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
