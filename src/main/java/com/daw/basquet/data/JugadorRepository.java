package com.daw.basquet.data;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{


    List<Jugador> findByNombre(String nombre);

    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);

    List<Jugador> findByPosicion(String posicion);

    List<Jugador> findByFechaNcimientoBefore(LocalDate fechaNcimiento);

    List<Jugador> findJugadorsByEquipoNombreequipo(String nombreequipo);

    List<Jugador> findJugadorsByEquipoNombreequipoAndAndPosicion(String nombreequipo, String posicion);

    @Query("SELECT AVG (numAsistencias), AVG (numCanastas), AVG (numRebotes), posicion FROM Jugador GROUP BY posicion")
    List<Object[]> findAveragePerPosition();

    @Query("SELECT MAX (numAsistencias), MAX (numCanastas), MAX (numRebotes), MIN (numAsistencias), MIN (numCanastas), MIN (numRebotes), posicion FROM Jugador GROUP BY posicion")
    List<Object[]> findMaxMinPerPosition();

    @Query("SELECT i from Jugador i where i.equipo.nombreequipo=:nombreequipo order by i.numCanastas desc")
    List<Jugador> findMaxCanastasPerEquipo(@Param("nombreequipo") String nombreequipo, Pageable pageable);


}

