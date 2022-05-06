
package com.porfolio.SpringBoot.Controller;

import com.porfolio.SpringBoot.model.User;
import com.porfolio.SpringBoot.service.IUserService;
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
public class Controller {
    
    @Autowired
    private IUserService userServ;
    
    
    @PostMapping("/new/user")
    public void agregarUsuario (@RequestBody User userr){
        userServ.crearUser(userr);
    }
    
    @GetMapping("/ver/users")
    @ResponseBody
    public List<User> verUsers (){
        return userServ.verUsers();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarUser(@PathVariable Long id){
          userServ.borrarUser(id);
    }
    
}
