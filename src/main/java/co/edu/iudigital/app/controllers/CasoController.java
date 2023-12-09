package co.edu.iudigital.app.controllers;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.dtos.CasoDTORequest;
import co.edu.iudigital.app.exception.CustomException;
import co.edu.iudigital.app.services.ifaces.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casos")
public class CasoController {

    @Autowired
    private ICasoService casoService;

    @GetMapping
    public ResponseEntity<List<CasoDTO>> index() throws CustomException {
        return ResponseEntity.ok()
                .body(casoService.getAll());
    }

    @PostMapping
    public ResponseEntity<CasoDTO> save(
            @Validated @RequestBody CasoDTORequest request
    ) throws CustomException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(casoService.save(request));
    }



}
