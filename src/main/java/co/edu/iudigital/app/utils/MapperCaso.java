package co.edu.iudigital.app.utils;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.dtos.CasoDTORequest;
import co.edu.iudigital.app.models.Caso;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperCaso {

    public CasoDTO toCasoDTO(Caso caso){
        return CasoDTO.builder()
                .id(caso.getId())
                .fechaHora(caso.getFechaHora())
                .detalle(caso.getDetalle())
                .latitud(caso.getLatitud())
                .longitud(caso.getLongitud())
                .altitud(caso.getAltitud())
                .build();
    }

    public Caso toCaso(CasoDTO casoDTO){
        Caso caso = new Caso();
        caso.setId(casoDTO.getId());
        caso.setFechaHora(casoDTO.getFechaHora());
        caso.setDetalle(casoDTO.getDetalle());
        caso.setLatitud(casoDTO.getLatitud());
        caso.setLongitud(casoDTO.getLongitud());
        caso.setAltitud(casoDTO.getAltitud());
        return caso;
    }

    public Caso toCaso(CasoDTORequest casoDTO){
        Caso caso = new Caso();
        caso.setFechaHora(casoDTO.getFechaHora());
        caso.setDetalle(casoDTO.getDetalle());
        caso.setLatitud(casoDTO.getLatitud());
        caso.setLongitud(casoDTO.getLongitud());
        caso.setAltitud(casoDTO.getAltitud());
        return caso;
    }

    public List<CasoDTO> toCasosDTO(
            List<Caso> casos
    ){
        return casos.stream()
                .map(caso -> toCasoDTO(caso))
                .collect(Collectors.toList());
    }

    public List<Caso> toCasos(
            List<CasoDTO> casosDTO
    ){
        return casosDTO.stream()
                .map(casoDTO -> toCaso(casoDTO))
                .collect(Collectors.toList());
    }
}

