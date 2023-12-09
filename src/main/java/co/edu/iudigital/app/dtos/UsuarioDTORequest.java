package co.edu.iudigital.app.dtos;

import co.edu.iudigital.app.models.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTORequest implements Serializable {

    @NotNull(message = "Nombre es obligatorio")
    //@JsonProperty("nombre") // redundante
    String nombre;

    //@JsonProperty("apellido") // redundante
    String apellido;
    //@JsonProperty("user_name") // redundante
    String username;
    //@JsonProperty("fecha_nacimiento") // redundante
    LocalDate fechaNacimiento;

    //@JsonProperty("enabled") // redundante
    Boolean enabled;
    //@JsonProperty("image") // redundante
    String image;
    //@JsonProperty("red_social") // redundante
    Boolean redSocial;


}
