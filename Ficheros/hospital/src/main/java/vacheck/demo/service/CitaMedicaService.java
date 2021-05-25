package vacheck.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vacheck.demo.model.CitaMedica;
import vacheck.demo.repository.CitaMedicaRepository;

import java.util.List;

@Service
public class CitaMedicaService {

    @Autowired
    CitaMedicaRepository citaMedicaRepository;

    public List<CitaMedica> getAll(){
        return citaMedicaRepository.findAll();
    }

    public void save(CitaMedica ci){
        citaMedicaRepository.saveAndFlush(ci);
    }

    public void delete(Integer IdCita){
        citaMedicaRepository.deleteById(IdCita);
    }

    public CitaMedica getById(Integer IdCita){
        return citaMedicaRepository.getOne(IdCita);
    }

}
