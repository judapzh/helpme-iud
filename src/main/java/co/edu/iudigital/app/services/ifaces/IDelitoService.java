package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.dtos.DelitoDTORequest;
import co.edu.iudigital.app.exception.CustomException;

import java.util.List;

public interface IDelitoService {

    List<DelitoDTO> getAll() throws CustomException;

    DelitoDTO save(DelitoDTORequest request) throws CustomException;

    DelitoDTO getById(Long id) throws CustomException;

    void deleteById(Long id) throws CustomException;
}

