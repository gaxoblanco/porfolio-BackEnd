
package com.porfolio.SpringBoot.Controller;

import com.porfolio.SpringBoot.model.Estudio;
import com.porfolio.SpringBoot.service.IEstudioService;
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
public class EstudioController {
    
    @Autowired
    public IEstudioService estServ;
    
    @PostMapping("/new/estudio")
    public void agregarUsuario (@RequestBody Estudio est){
        estServ.crearEstudio(est);
    }
    
    @GetMapping("/ver/estudio")
    @ResponseBody
    public List<Estudio> verEstudios (){
        return estServ.verEstudios();
    }
    
    @DeleteMapping ("/delete/estudio/{id}")
    public void borrarUser(@PathVariable Long id){
          estServ.borrarEstudio(id);
    }
}
