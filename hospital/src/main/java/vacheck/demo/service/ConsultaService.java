package vacheck.demo.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vacheck.demo.repository.ConsultaRepository;
import vacheck.demo.model.*;

@Service
public class ConsultaService {

	@Autowired
ConsultaRepository consultaRepository;
	
	public List<Consulta> getAll(){
		
		return consultaRepository.findAll();
		
		
	}
	
	 public void save(Consulta c) {
	        consultaRepository.saveAndFlush(c);
	    }
	
	 public void delete(Integer id) {
	     consultaRepository.deleteById(id);

	    }
	 
	 public Consulta getById(Integer id) {


	       return consultaRepository.getOne(id);
	    }
}
