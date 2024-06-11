package com.cibertec.librotec.Entitys;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localidad")
public class LocalidadEntity extends BaseEntity {





    private String name;

  }



