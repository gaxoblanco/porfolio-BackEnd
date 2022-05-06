
package com.porfolio.SpringBoot.security;

import com.porfolio.SpringBoot.repository.LoginRepository;
import com.porfolio.SpringBoot.model.User;
import com.porfolio.SpringBoot.model.dto.UserDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class Autentication {
    
    @Autowired
    LoginRepository loginRepo;
    
    @Autowired
    PasswordEncoder passEnco;
    
    public boolean UserEnabled (UserDto userDto){
        boolean userEnabled = false;
        List<User> users = loginRepo.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if(!users.isEmpty()){
            User user = users.get(0);
            // Realizar aca comparacion de password
            if(passEnco.matches(userDto.getPassword(), user.getPassword())){
                return userEnabled = true;
            }
        } 
        return userEnabled;
    }
    
    public void crearUsuario (User user) throws Exception{
        List<User> users = loginRepo.findByEmailAndIsEnabledTrue(user.getEmail());
        if (!users.isEmpty()){
            throw new Exception ("El email ya estar registrado.");
        } else{
            user.setPassword(passEnco.encode(user.getPassword()));
            user.setEnabled(true);
            loginRepo.save(user);
        }
    }
}
