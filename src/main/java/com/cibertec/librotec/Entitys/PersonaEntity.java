package com.cibertec.librotec.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class PersonaEntity extends BaseEntity {



  private String name;

  private String lastName;

  @Column(name = "dni" ,columnDefinition = "char(8)")
  private String dni;

  @OneToOne(cascade = CascadeType.ALL )
  private DireccionEntity direccion;


  @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
  private List<LibroEntity> libros = new ArrayList<LibroEntity>();

}
