package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador(){


        Jugador ibrahim = new Jugador (
                "Ibrahim",
                LocalDate.of(1997,1,28),
                8,8,8, "alero");

        ibrahim.setEquipo(equipoRepository.findOne(2L));
        jugadorRepository.saveAndFlush(ibrahim);


        Jugador semedo = new Jugador (
                "Semedo",
                LocalDate.of(1991,5,3),
                1,1,1, "alero");

        semedo.setEquipo(equipoRepository.findOne(1L));
        jugadorRepository.saveAndFlush(semedo);

        Jugador angelo = new Jugador(
                "Angelo",
                LocalDate.of(1987,1,22),
                25,6,7,"base");

        angelo.setEquipo(equipoRepository.findOne(2L));
        jugadorRepository.saveAndFlush(angelo);

        Jugador alex = new Jugador (
                "Alex",
                LocalDate.of(1993,5,16),
                10,28,13, "base");

        alex.setEquipo(equipoRepository.findOne(1L));
        jugadorRepository.saveAndFlush(alex);

        Jugador martin = new Jugador(
                "Martin",
                LocalDate.of(1992,5,30),
                2,0,1,"escolta");

        martin.setEquipo(equipoRepository.findOne(1L));
        jugadorRepository.saveAndFlush(martin);

        Jugador santana = new Jugador (
                "Santana",
                LocalDate.of(1990,6,6),
                4,3,7, "escolta");

        santana.setEquipo(equipoRepository.findOne(2L));
        jugadorRepository.saveAndFlush(santana);

        Jugador rusty = new Jugador(
                "Rusty",
                LocalDate.of(1997,8,20),
                23,0,10,"pivot");

        rusty.setEquipo(equipoRepository.findOne(1L));
        jugadorRepository.saveAndFlush(rusty);

        Jugador sakuragi = new Jugador (
                "Sakuragi",
                LocalDate.of(1995,9,8),
                2,20,13, "pivot");

        sakuragi.setEquipo(equipoRepository.findOne(2L));
        jugadorRepository.saveAndFlush(sakuragi);

        Jugador albert = new Jugador(
                "Albert",
                LocalDate.of(1998,7,12),
                35,12,0,"ala-pivot");

        albert.setEquipo(equipoRepository.findOne(1L));
        jugadorRepository.saveAndFlush(albert);

        Jugador gori = new Jugador (
                "Gori",
                LocalDate.of(1996,10,2),
                15,6,8, "ala-pivot");

        gori.setEquipo(equipoRepository.findOne(2L));
        jugadorRepository.saveAndFlush(gori);

        Jugador jugador1 = new Jugador (
                "Jugador1",
                LocalDate.of(1996,10,2),
                15,6,8, "ala-pivot");

        jugador1.setEquipo(equipoRepository.findOne(3L));
        jugadorRepository.saveAndFlush(jugador1);

        Jugador jugador2 = new Jugador (
                "Jugador2",
                LocalDate.of(1996,10,2),
                14,6,8, "pivot");

        jugador2.setEquipo(equipoRepository.findOne(3L));
        jugadorRepository.saveAndFlush(jugador2);

        Jugador jugador3 = new Jugador (
                "Jugador3",
                LocalDate.of(1996,10,2),
                17,9,35, "escolta");

        jugador3.setEquipo(equipoRepository.findOne(3L));
        jugadorRepository.saveAndFlush(jugador3);

        Jugador jugador4 = new Jugador (
                "Jugador4",
                LocalDate.of(1996,10,2),
                13,8,34, "base");

        jugador4.setEquipo(equipoRepository.findOne(3L));
        jugadorRepository.saveAndFlush(jugador4);

        Jugador jugador5 = new Jugador (
                "Jugador5",
                LocalDate.of(1996,10,2),
                15,6,8, "alero");

        jugador5.setEquipo(equipoRepository.findOne(3L));
        jugadorRepository.saveAndFlush(jugador5);

        Jugador jugador6 = new Jugador (
                "Jugador6",
                LocalDate.of(1996,10,2),
                8,18,8, "ala-pivot");

        jugador6.setEquipo(equipoRepository.findOne(4L));
        jugadorRepository.saveAndFlush(jugador6);

        Jugador jugador7 = new Jugador (
                "Jugador7",
                LocalDate.of(1996,10,2),
                28,16,18, "pivot");

        jugador7.setEquipo(equipoRepository.findOne(4L));
        jugadorRepository.saveAndFlush(jugador7);

        Jugador jugador8 = new Jugador (
                "Jugador8",
                LocalDate.of(1996,10,2),
                4,11,6, "escolta");

        jugador8.setEquipo(equipoRepository.findOne(4L));
        jugadorRepository.saveAndFlush(jugador8);

        Jugador jugador9 = new Jugador (
                "Jugador9",
                LocalDate.of(1996,10,2),
                23,4,30, "base");

        jugador9.setEquipo(equipoRepository.findOne(4L));
        jugadorRepository.saveAndFlush(jugador9);

        Jugador jugador10 = new Jugador (
                "Jugador10",
                LocalDate.of(1996,10,2),
                15,6,8, "alero");

        jugador10.setEquipo(equipoRepository.findOne(4L));
        jugadorRepository.saveAndFlush(jugador10);

        Jugador jugador11 = new Jugador (
                "Jugador11",
                LocalDate.of(1996,10,2),
                11,21,18, "ala-pivot");

        jugador11.setEquipo(equipoRepository.findOne(5L));
        jugadorRepository.saveAndFlush(jugador11);

        Jugador jugador12 = new Jugador (
                "Jugador12",
                LocalDate.of(1996,10,2),
                10,36,3, "pivot");

        jugador12.setEquipo(equipoRepository.findOne(5L));
        jugadorRepository.saveAndFlush(jugador12);

        Jugador jugador13 = new Jugador (
                "Jugador13",
                LocalDate.of(1996,10,2),
                19,7,2, "escolta");

        jugador13.setEquipo(equipoRepository.findOne(5L));
        jugadorRepository.saveAndFlush(jugador13);

        Jugador jugador14 = new Jugador (
                "Jugador14",
                LocalDate.of(1996,10,2),
                5,0,25, "base");

        jugador14.setEquipo(equipoRepository.findOne(5L));
        jugadorRepository.saveAndFlush(jugador14);

        Jugador jugador15 = new Jugador (
                "Jugador15",
                LocalDate.of(1996,10,2),
                18,9,7, "alero");

        jugador15.setEquipo(equipoRepository.findOne(5L));
        jugadorRepository.saveAndFlush(jugador15);
}

public void consultas(){
    System.out.println(" ");
    System.out.println("Encontrar Jugador por fecha de nacimiento:");
    System.out.println("==========================================");
    for (Jugador fecha: jugadorRepository.findByFechaNcimientoBefore(LocalDate.of(1990,1,1))) {
        System.out.println(fecha);
    }
    System.out.println(" ");
    System.out.println("Encontrar Jugador por nombre:");
    System.out.println("=============================");
    for (Jugador nombre: jugadorRepository.findByNombre("rusty")) {
        System.out.println(nombre);
    }
    System.out.println(" ");
    System.out.println("Encontrar Jugadores entre un parámetro de asistencias:");
    System.out.println("======================================================");
    for (Jugador asistencias: jugadorRepository.findByNumAsistenciasBetween(5,30)){
        System.out.println(asistencias);
    }
    System.out.println(" ");
    System.out.println("Encontrar Jugadores con más canastas que un valor establecido:");
    System.out.println("==============================================================");
    for (Jugador canastas: jugadorRepository.findByNumCanastasGreaterThanEqual(16)){
        System.out.println(canastas);
    }
    System.out.println(" ");
    System.out.println("Encontrar Jugadores según su posición:");
    System.out.println("======================================");
    for (Jugador posicion: jugadorRepository.findByPosicion("pivot")){
        System.out.println(posicion);
    }
    System.out.println(" ");

    List<Object[]> positionlist = jugadorRepository.findAveragePerPosition();
    System.out.println("Media de las estadisticas según la posicion:");
    System.out.println("============================================");
    for(Object[] stat: positionlist){
        System.out.println(" ");
        System.out.println("Posición: "+ stat[3]);
        System.out.println("Media de asistencias: "+ stat[0]);
        System.out.println("Media de canastas: "+ stat[1]);
        System.out.println("Media de rebotes: "+ stat[2]);
        System.out.println(" ");
    }

    List<Object[]> positionlistmaxmin = jugadorRepository.findMaxMinPerPosition();
    System.out.println("Máximos y mínimos de las estadisticas según la posicion:");
    System.out.println("========================================================");
    for(Object[] stat: positionlistmaxmin){
        System.out.println(" ");
        System.out.println("Posición: "+ stat[6]);
        System.out.println("Nº máximo de asistencias: "+ stat[0]);
        System.out.println("Nº máximo de canastas: "+ stat[1]);
        System.out.println("Nº máximo de rebotes: "+ stat[2]);
        System.out.println("Nº mínimo de asistencias: "+ stat[3]);
        System.out.println("Nº mínimo de canastas: "+ stat[4]);
        System.out.println("Nº mínimo de rebotes: "+ stat[5]);
        System.out.println(" ");
    }

    System.out.println("Lista de Jugadores según el nombre del equipo:");
    System.out.println("==============================================");
    for (Jugador listajugadores:jugadorRepository.findJugadorsByEquipoNombreequipo( "Bulls")) {
        System.out.println(listajugadores);
    }

    System.out.println("Lista de Jugadores según el nombre del equipo y una posición:");
    System.out.println("=============================================================");
    for (Jugador listajugadores:jugadorRepository.findJugadorsByEquipoNombreequipoAndAndPosicion( "Spurs","base")) {
        System.out.println(listajugadores);
    }


    System.out.println("Jugadores con más canastas según el equipo:");
    System.out.println("===========================================");

          jugadorRepository.findMaxCanastasPerEquipo("Lakers", new PageRequest(0,1)).forEach(
                  jugador -> System.out.println(jugador.getNombre() + ": " + jugador.getNumCanastas() +" canastas.")
          );
           System.out.println(" ");


}

}
