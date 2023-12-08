package co.edu.iudigital.app.dtos;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CasoDTO {

    Long id;

    LocalDateTime fechaHora;

    Float latitud;

    Float longitud;

    Float altitud;

    Boolean isVisible;

    String detalle;

    String urlMap;

    String rmiUrl;

    CasoDTO caso = CasoDTO.builder()
            .id(1L)
            .fechaHora(LocalDateTime.now())
            .latitud(123.45F)
            .longitud(67.89F)
            .isVisible(true)
            .detalle("Detalles del caso")
            .urlMap("https://mapa.com")
            .rmiUrl("https://rmi.com")
            .build();



}