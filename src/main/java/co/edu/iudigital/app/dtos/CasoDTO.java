package co.edu.iudigital.app.dtos;
import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
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

    public static Snippet builder() {
        return null;
    }
}