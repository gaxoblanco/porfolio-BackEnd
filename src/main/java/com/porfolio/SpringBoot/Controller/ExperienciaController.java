
package com.porfolio.SpringBoot.Controller;

import com.porfolio.SpringBoot.model.Experiencia;
import com.porfolio.SpringBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarUsuario (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias (){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarUser(@PathVariable Long id){
          expServ.borrarExperiencia(id);
    }
}
