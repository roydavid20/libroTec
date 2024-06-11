package com.cibertec.librotec.repositorios;

import com.cibertec.librotec.Entitys.PersonaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<PersonaEntity, Long>{

  //Metodo Query

  List<PersonaEntity> findByNameContainingOrLastNameContaining(String name, String lastName);

  //Query con page result
  Page<PersonaEntity> findByNameContainingOrLastNameContaining(String name, String lastName, Pageable pageable);

  //Metodo JPQL

  //parametros indexados
  //@Query(value = "SELECT p FROM PersonaEntity p WHERE p.name LIKE %?1% ")
  //List<PersonaEntity> search(String filtro);

  //parametros nombrados

  //@Query(value = "SELECT p FROM PersonaEntity p WHERE p.name LIKE %:filtro%  OR p.lastName LIKE %:filtro%")
  //List<PersonaEntity> search(@Param("filtro") String filtro);

  @Query(value = "SELECT p FROM PersonaEntity p WHERE p.name LIKE %:filtro%  OR p.lastName LIKE %:filtro%")
  Page<PersonaEntity> search(@Param("filtro") String filtro, Pageable pageable);

  //Metodo Nativo

  @Query(value = "SELECT * FROM persona p WHERE p.name LIKE %:filtro% OR p.last_name LIKE %:filtro%", nativeQuery = true)
  List<PersonaEntity> searchNative(String filtro);

  @Query(value = "SELECT * FROM persona p WHERE p.name LIKE %:filtro% OR p.last_name LIKE %:filtro%", nativeQuery = true)
  Page<PersonaEntity> searchNativePage(String filtro, Pageable pageable);

}
