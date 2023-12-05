package co.edu.iudigital.app.controllers;

import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.services.ifaces.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delitos")

public class DelitoController {
    @Autowired
    private IDelitoService delitoService;

    @GetMapping
    public ResponseEntity<List<DelitoDTO>> index(){
        return ResponseEntity
                .ok()
                .body(delitoService.findAll());
    }

    @GetMapping("/otra")
    public ResponseEntity<Object> ejemplo(){
        return ResponseEntity.ok().body("Otra cosa");
    }
}

