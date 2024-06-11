package com.cibertec.librotec.Controller;

import com.cibertec.librotec.Entitys.BaseEntity;
import com.cibertec.librotec.Service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseControllerImpl <E extends BaseEntity, S extends BaseServiceImpl <E , Long>>  implements  IBaseController <E, Long>{

  @Autowired
  protected S service;


  @GetMapping("")
  public ResponseEntity<?> getAll() {
    try {

      return ResponseEntity.status(HttpStatus.OK).body(service.findAll());


    } catch (Exception e) {

      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getOne(@PathVariable Long id) {
    try {

      return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));

    } catch (Exception e) {

      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

    }
  }

  @PostMapping("")
  public ResponseEntity<?> save(E entity) {
    try {

      return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));

    } catch (Exception e) {

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity) {
    try {


      return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
    } catch (Exception e) {

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> delete(
   @PathVariable Long id) {
    try {


      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));

    } catch (Exception e) {

      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

    }
  }
}
