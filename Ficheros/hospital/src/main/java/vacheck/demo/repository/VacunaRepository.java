package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vacheck.demo.model.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {

}
