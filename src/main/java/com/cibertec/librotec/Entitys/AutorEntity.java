package com.cibertec.librotec.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autor")
public class AutorEntity extends BaseEntity{



  @Column(name = "name" , length = 30)
  private String name;
  @Column(name = "lastname", length = 30)
  private String lastName;
  @Column(name = "biography", length = 1000 )
  private String biography;


}
