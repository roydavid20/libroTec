package com.cibertec.librotec.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class LibroEntity extends BaseEntity{



  private String title;

  private String genre;

  private int pages;

  @ManyToMany(cascade = CascadeType.REFRESH)
  private List<AutorEntity> autores;
}
