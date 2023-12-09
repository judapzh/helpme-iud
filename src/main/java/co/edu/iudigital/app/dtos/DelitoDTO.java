package co.edu.iudigital.app.dtos;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder // patrón
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class DelitoDTO {


    Long id;

    String nombre;

    String descripcion;

}