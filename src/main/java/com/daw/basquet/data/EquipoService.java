package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;


    public void testEquipo(){
        Equipo bulls = new Equipo (
                "Bulls", "Chicago", LocalDate.of(1980,5,26)
        );



        Equipo heat = new Equipo (
                "Heat", "Miami", LocalDate.of(1890,3,29)
        );



        Equipo lakers = new Equipo (
                "Lakers","Los Angeles",LocalDate.of(1880,4,9)
        );



        Equipo nets = new Equipo (
                "Nets", "New York",LocalDate.of(1882,9,23)
        );



        Equipo spurs = new Equipo (
                "Spurs", "San Antonio", LocalDate.of(1870,10,17)
        );

        equipoRepository.save(spurs);
        equipoRepository.save(bulls);
        equipoRepository.save(nets);
        equipoRepository.save(lakers);
        equipoRepository.save(heat);

    }

    public void consultasequipo(){

    }

}
