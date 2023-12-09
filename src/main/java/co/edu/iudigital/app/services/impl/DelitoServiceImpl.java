package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.dtos.DelitoDTORequest;
import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.repositories.IDelitoRepository;
import co.edu.iudigital.app.services.ifaces.IDelitoService;
import co.edu.iudigital.app.utils.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DelitoServiceImpl implements IDelitoService {

    // inyección de dependencias (por atributo)
    @Autowired
    private IDelitoRepository delitoRepository;

    @Autowired
    private Mapper mapper; // mapper de utilidades

    @Override
    public List<DelitoDTO> getAll() {
        List<Delito> delitos =
                delitoRepository.findAll();
        return mapper.toDelitosDTO(delitos);

    }

    @Override
    public DelitoDTO save(DelitoDTORequest delitoDTO) {
        Delito delito = mapper.toDelito(delitoDTO);
        delito = delitoRepository.save(delito);
        return mapper.toDelitoDTO(delito);
    }

    @Override
    public DelitoDTO getById(Long id) {
        Optional<Delito> delitoOptional =
                delitoRepository.findById(id);
        DelitoDTO delitoDTO;
        delitoDTO = new DelitoDTO();
        if(delitoOptional.isPresent()) {
            delitoDTO = mapper.toDelitoDTO(delitoOptional.get());
        }
        return delitoDTO;
    }

    @Override
    public void deleteById(Long id) {
        delitoRepository.deleteById(id);
    }
}