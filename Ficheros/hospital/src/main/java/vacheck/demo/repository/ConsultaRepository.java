package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vacheck.demo.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

	
}
