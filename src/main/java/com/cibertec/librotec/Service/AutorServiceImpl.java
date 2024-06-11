package com.cibertec.librotec.Service;

import com.cibertec.librotec.Entitys.AutorEntity;
import com.cibertec.librotec.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <AutorEntity, Long> implements AutorService {

  public AutorServiceImpl(BaseRepository<AutorEntity, Long> baseRepository) {
    super(baseRepository);
  }
}
