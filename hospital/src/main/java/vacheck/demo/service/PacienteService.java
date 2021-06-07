package vacheck.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vacheck.demo.model.Paciente;
import vacheck.demo.repository.PacienteRepository;


@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	public List<Paciente> getAll(){
		return pacienteRepository.findAll();
	}
	
	public void save(Paciente p){
        pacienteRepository.saveAndFlush(p);
    }

    public void delete(Integer Id){
        pacienteRepository.deleteById(Id);
    }

    public Paciente getById(Integer Id){
        return pacienteRepository.getOne(Id);
    }
}
