package co.edu.iudigital.app.dtos;

import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTO {


    Long id;

    String nombre;

    String descripcion;

    DelitoDTO delito = DelitoDTO.builder()
            .id(1L)
            .nombre("Nombre del delito")
            .descripcion("Descripción del delito")
            .build();



}