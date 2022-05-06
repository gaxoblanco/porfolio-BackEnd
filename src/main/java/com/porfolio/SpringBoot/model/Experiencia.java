
package com.porfolio.SpringBoot.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trabajo;
    private String puesto;
    private String descripcion;
    private Date ini;
    private Date fin;
    private String url;
    private String logo;
}
