package com.cibertec.librotec.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "direccion")
public class DireccionEntity extends BaseEntity {


  private String street;

  private Integer number;

  @ManyToOne(optional = true)
  @JoinColumn(name = "localidad_id")
  private LocalidadEntity localidad;
}
