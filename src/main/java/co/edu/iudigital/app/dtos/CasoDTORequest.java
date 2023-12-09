package co.edu.iudigital.app.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CasoDTORequest implements Serializable{
    @NotNull(message = "fecha es obligatorio")
    //@JsonProperty("fecha_hora") // redundante
    LocalDateTime fechaHora;

    //@JsonProperty("detalle") // redundante
    String detalle;
    //@JsonProperty("latitud") // redundante
    Float latitud;
    //@JsonProperty("longitud") // redundante
    Float longitud;
    //@JsonProperty("altictud") // redundante
    Float altitud;
}
