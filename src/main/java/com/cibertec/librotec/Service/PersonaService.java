package com.cibertec.librotec.Service;

import com.cibertec.librotec.Entitys.PersonaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends IBaseService<PersonaEntity, Long>{

  List<PersonaEntity> search(String filtro) throws Exception;

  Page<PersonaEntity> search(String filtro, Pageable pageable) throws Exception;
}
