package com.daw.basquet.data;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Long>{

    List<Equipo> findByNombreequipo(String nombreequipo);


    List<Equipo> findByLocalidad(String Localidad);


}
