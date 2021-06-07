package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vacheck.demo.model.CitaMedica;

public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Integer> {
}
