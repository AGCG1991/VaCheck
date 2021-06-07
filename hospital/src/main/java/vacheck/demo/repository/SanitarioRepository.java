package vacheck.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vacheck.demo.model.Sanitario;



public interface SanitarioRepository extends JpaRepository<Sanitario, Integer>{

}
