package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.exception.CustomException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IDelitoService {
    List<DelitoDTO> getAll() throws CustomException;

    @Transactional(readOnly = true)
    List<DelitoDTO> findAll();

    DelitoDTO findById(Long id) throws CustomException;

    DelitoDTO save(DelitoDTO delito) throws CustomException;

    DelitoDTO getById(Long id) throws CustomException;

    void delete(Long id) throws CustomException;
}
