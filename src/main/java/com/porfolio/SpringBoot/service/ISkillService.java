
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> verSkills();
    public void crearSkill(Skill ski);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);
}
