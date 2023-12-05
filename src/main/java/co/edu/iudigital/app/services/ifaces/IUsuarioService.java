package co.edu.iudigital.app.services.ifaces;


import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.exception.CustomException;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface IUsuarioService {
    List<UsuarioDTO> getAll() throws CustomException;
    @Transactional(readOnly = true)
    List<UsuarioDTO> findAll();
    UsuarioDTO findById(Long id) throws CustomException;

    UsuarioDTO save(UsuarioDTO role) throws CustomException;

    UsuarioDTO  getById(Long id) throws CustomException;

    void delete(Long id) throws CustomException;
}