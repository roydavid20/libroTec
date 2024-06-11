package com.cibertec.librotec.Controller;

import com.cibertec.librotec.Entitys.PersonaEntity;
import com.cibertec.librotec.Service.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<PersonaEntity, PersonaServiceImpl>{


  @GetMapping("/search")
  public ResponseEntity<?> search(@RequestParam String filtro){

    try {
      return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
    }catch (Exception e){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

  @GetMapping("/searchPage")
  public ResponseEntity<?> searchPage(@RequestParam String filtro, Pageable pageable){

    try {
      return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro, pageable));
    }catch (Exception e){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
    }
  }

}
