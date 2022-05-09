package com.porfolio.SpringBoot.Controller;

import com.porfolio.SpringBoot.model.Skill;
import com.porfolio.SpringBoot.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    public ISkillService skillServ;
    
    @PostMapping("/new/skill")
    public void agregarSkill (@RequestBody Skill ski){
        skillServ.crearSkill(ski);
    }
    
    @GetMapping("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill (){
        return skillServ.verSkills();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
          skillServ.borrarSkill(id);
    }
}
