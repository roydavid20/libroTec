package com.cibertec.librotec.Controller;

import com.cibertec.librotec.Entitys.AutorEntity;
import com.cibertec.librotec.Entitys.LocalidadEntity;
import com.cibertec.librotec.Service.AutorServiceImpl;
import com.cibertec.librotec.Service.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends BaseControllerImpl<LocalidadEntity, LocalidadServiceImpl>{
}
