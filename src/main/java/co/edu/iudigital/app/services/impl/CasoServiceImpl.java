package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.models.Caso;
import co.edu.iudigital.app.repositories.ICasoRepository;
import co.edu.iudigital.app.services.ifaces.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasoServiceImpl implements ICasoService {
    private final ICasoRepository casoRepository;

    @Autowired
    public CasoServiceImpl(ICasoRepository casoRepository){
        this.casoRepository = casoRepository;
    }

    @Override
    public List<CasoDTO> getAll() {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<CasoDTO> findAll() {
        List<Caso> casos = casoRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return casos.stream().map(c ->
                   CasoDTO.builder()
                            .id(c.getId())
                            .fechaHora(c.getFechaHora())
                            .latitud(c.getLatitud())
                            .altitud(c.getAltitud())
                            .isVisible(c.getIsVisible())
                            .detalle(c.getDetalle())
                            .urlMap(c.getUrlMap())
                            .rmiUrl(c.getRmiUrl())
                            .build())
                              .collect(Collectors.toList());
        }

    @Override
    public CasoDTO findById(Long id) {
        return null;
    }

    @Override
    public CasoDTO save(CasoDTO casoDTO) {
        return null;
    }

    @Override
    public CasoDTO getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

