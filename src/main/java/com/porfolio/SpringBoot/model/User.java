
package com.porfolio.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private String foto;
    private boolean isEnabled;
    
    public User() {
    }

    public User(String email, String password, String nombre, String apellido, String foto, boolean isEnabled) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.isEnabled = isEnabled;
    }

}
