
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.About;
import java.util.List;


public interface IAboutService {
    public List<About> verAbouts();
    public void agregarAbout(About abo);
    public void borrarAbout(Long id);
    public About buscarAbout(Long id);
    public void updateAbout(About abo);
}
