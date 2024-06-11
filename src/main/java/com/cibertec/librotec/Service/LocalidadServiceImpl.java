package com.cibertec.librotec.Service;

import com.cibertec.librotec.Entitys.LocalidadEntity;

import com.cibertec.librotec.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <LocalidadEntity, Long> implements LocalidadService{
  public LocalidadServiceImpl(BaseRepository<LocalidadEntity, Long> baseRepository) {
    super(baseRepository);
  }
}
