
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.User;
import com.porfolio.SpringBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> verUsers() {
        return userRepo.findAll();
     }

    @Override
    public void crearUser(User userr) {
        userRepo.save(userr);
    }

    @Override
    public void borrarUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User buscarUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
}
