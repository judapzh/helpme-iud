package co.edu.iudigital.app.dtos;

import co.edu.iudigital.app.models.Role;
import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
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