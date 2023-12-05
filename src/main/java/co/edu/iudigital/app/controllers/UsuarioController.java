package co.edu.iudigital.app.controllers;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.services.ifaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> index() {
        return ResponseEntity
                .ok()
                .body(usuarioService.findAll());
    }

    @GetMapping("/otra")
    public ResponseEntity<Object> ejemplo() {
        return ResponseEntity.ok().body("Otra cosa");
    }
}
