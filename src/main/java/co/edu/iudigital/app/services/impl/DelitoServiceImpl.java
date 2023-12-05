package co.edu.iudigital.app.services.impl;


import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.repositories.IDelitoRepository;
import co.edu.iudigital.app.services.ifaces.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class DelitoServiceImpl implements IDelitoService {
    private final IDelitoRepository delitoRepository;

    @Autowired
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository = delitoRepository;
    }

    @Override
    public List<DelitoDTO> getAll() {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DelitoDTO> findAll() {
        List<Delito> delitos = delitoRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return delitos.stream().map(d ->
            DelitoDTO.builder()
              .id(d.getId())
              .nombre(d.getNombre())
              .descripcion(d.getDescripcion())
              .build()
        ).collect(Collectors.toList());
    }

    @Override
    public DelitoDTO findById(Long id) {
        return null;
    }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO) {
        return null;
    }

    @Override
    public DelitoDTO getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
