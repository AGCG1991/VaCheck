package vacheck.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vacheck.demo.model.Sanitario;
import vacheck.demo.repository.SanitarioRepository;

@Service
public class SanitarioService{

    @Autowired
    SanitarioRepository SanitarioRepository;

    public List<Sanitario>getAll(){
        return SanitarioRepository.findAll();
    }


    public void save(Sanitario s) {
        SanitarioRepository.saveAndFlush(s);
    }


    public void delete(Integer id) {
        SanitarioRepository.deleteById(id);
    }


    public Sanitario getById(Integer id) {
        return SanitarioRepository.getOne(id);
    }

}
