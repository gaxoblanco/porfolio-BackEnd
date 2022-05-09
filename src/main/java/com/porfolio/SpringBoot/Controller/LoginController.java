
package com.porfolio.SpringBoot.Controller;

import com.porfolio.SpringBoot.model.User;
import com.porfolio.SpringBoot.model.dto.UserDto;
import com.porfolio.SpringBoot.security.Autentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    Autentication autServ;
    
    @PostMapping ("/login")
    public boolean login (@RequestBody UserDto userDto){
        return autServ.UserEnabled(userDto);
    }
    
    
    @PostMapping("/register")
    public void register(@RequestBody User user) throws Exception {
        autServ.crearUsuario(user);
    }
}
