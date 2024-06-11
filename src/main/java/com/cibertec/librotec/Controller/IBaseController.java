package com.cibertec.librotec.Controller;

import com.cibertec.librotec.Entitys.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface IBaseController <E extends BaseEntity, ID extends Serializable>{

  public ResponseEntity<?> getAll();
  public ResponseEntity<?> getOne(@PathVariable ID id);
  public ResponseEntity<?> save(@RequestBody E entity);
  public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
  public ResponseEntity<?> delete(@PathVariable ID id);
}

