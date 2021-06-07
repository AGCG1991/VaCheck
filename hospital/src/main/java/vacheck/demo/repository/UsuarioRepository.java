package vacheck.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import vacheck.demo.model.*;
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	
}
