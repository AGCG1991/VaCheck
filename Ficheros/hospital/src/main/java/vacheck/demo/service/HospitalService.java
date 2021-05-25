package vacheck.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vacheck.demo.model.Hospital;
import vacheck.demo.model.Usuario;
import vacheck.demo.repository.HospitalRepository;
import vacheck.demo.repository.UsuarioRepository;

@Service
public class HospitalService{

    @Autowired//inyectamos listo para utilizar
    HospitalRepository hospitalRepository;

    public List<Hospital>getAll(){
        return hospitalRepository.findAll();//devuelve todo lo que tenemos en la base de datos
    }


    public void save(Hospital h) {
        hospitalRepository.saveAndFlush(h);
    }


    public void delete(Integer id) {
        hospitalRepository.deleteById(id);

    }


    public Hospital getById(Integer id) {


        return hospitalRepository.getOne(id);
    }

}
