package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.dtos.CasoDTORequest;
import co.edu.iudigital.app.exception.CustomException;
import co.edu.iudigital.app.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> getAll()throws CustomException;

    CasoDTO save(CasoDTO caso)throws CustomException;

    CasoDTO save(CasoDTORequest casoDTO);

    CasoDTO getById(Long id) throws CustomException;

    void deleteById(Long id);

    @Repository // ambigüo
    interface ICasoRepository
            extends JpaRepository<Caso, Long> {
    }
}