
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.Estudio;
import com.porfolio.SpringBoot.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstidoService implements IEstudioService{
    
    @Autowired
    public EstudioRepository estRepo;

    @Override
    public List<Estudio> verEstudios() {
        return estRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estRepo.findById(id).orElse(null);
    }
    
}
