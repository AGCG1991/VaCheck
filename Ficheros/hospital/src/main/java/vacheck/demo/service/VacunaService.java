package vacheck.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vacheck.demo.model.Vacuna;
import vacheck.demo.repository.VacunaRepository;


@Service
public class VacunaService {
    @Autowired
    VacunaRepository vacunaRepository;

    public List<Vacuna> getAll() {
        return vacunaRepository.findAll();
    }

    public void save(Vacuna v) {
        vacunaRepository.saveAndFlush(v);
    }

    public void delete(Integer id) {
        vacunaRepository.deleteById(id);
    }

    public Vacuna getById(Integer id) {
        return vacunaRepository.getOne(id);
    }
}
