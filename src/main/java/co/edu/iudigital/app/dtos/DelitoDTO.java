package co.edu.iudigital.app.dtos;

import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTO {


    Long id;

    String nombre;

    String descripcion;


}