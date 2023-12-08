package co.edu.iudigital.app.dtos;

import co.edu.iudigital.app.models.Role;
import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Builder
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

    UsuarioDTO usuario = UsuarioDTO.builder()
            .id(1L)
            .username("nombreDeUsuario")
            .nombre("Nombre")
            .apellido("Apellido")
            .fechaNacimiento(LocalDate.of(2000, 1, 1))
            .enabled(true)
            .image("ruta/de/imagen.jpg")
            .redSocial(false)
            .build();



}