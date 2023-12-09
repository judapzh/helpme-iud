package co.edu.iudigital.app.dtos;


import co.edu.iudigital.app.models.Role;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Builder // patrón
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTO {

    Long id;

    String username;
    String nombre;

    String apellido;


    LocalDate fechaNacimiento;


    Boolean enabled;

    String image;

    Boolean redSocial;

    List<Role> roles;






}