
package com.porfolio.SpringBoot.service;

import com.porfolio.SpringBoot.model.User;
import java.util.List;


public interface IUserService {
    public List<User> verUsers();
    public void crearUser(User userr);
    public void borrarUser(Long id);
    public User buscarUser(Long id);
}
