
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.About;
import com.porfolio.SpringBoot.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService{
    
    @Autowired
    public AboutRepository aboRepo;

    @Override
    public List<About> verAbouts() {
        return aboRepo.findAll();
    }

    @Override
    public void agregarAbout(About abo) {
        aboRepo.save(abo);
    }

    @Override
    public void borrarAbout(Long id) {
        aboRepo.deleteById(id);
    }

    @Override
    public About buscarAbout(Long id) {
        return aboRepo.findById(id).orElse(null);
    }

    @Override
    public void updateAbout(About abo) {
        aboRepo.save(abo);
    }

}
