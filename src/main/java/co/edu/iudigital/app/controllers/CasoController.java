package co.edu.iudigital.app.controllers;
import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.services.ifaces.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casos")

public class CasoController {
    @Autowired
    private ICasoService casoService;

    @GetMapping
    public ResponseEntity<List<CasoDTO>> index() {
        return ResponseEntity
                .ok()
                .body(casoService.findAll());
    }

    @GetMapping("/otra")
    public ResponseEntity<Object> ejemplo() {
        return ResponseEntity.ok().body("Otra cosa");
    }
}