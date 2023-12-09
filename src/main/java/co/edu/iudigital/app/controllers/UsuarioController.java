package co.edu.iudigital.app.controllers;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.dtos.UsuarioDTORequest;
import co.edu.iudigital.app.exception.CustomException;
import co.edu.iudigital.app.services.ifaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> index() throws CustomException {
        return ResponseEntity.ok()
                .body(usuarioService.getAll());
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(
            @Validated @RequestBody UsuarioDTORequest request
    ) throws CustomException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(usuarioService.save(request));
    }



}

