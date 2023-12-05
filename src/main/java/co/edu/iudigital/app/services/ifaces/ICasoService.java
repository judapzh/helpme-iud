package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.exception.CustomException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> getAll() throws CustomException;

    @Transactional(readOnly = true)
    List<CasoDTO> findAll();

    CasoDTO findById(Long id) throws CustomException;

    CasoDTO save(CasoDTO caso) throws CustomException;

    CasoDTO getById(Long id) throws CustomException;

    void delete(Long id) throws CustomException;
}