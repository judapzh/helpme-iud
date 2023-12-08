package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.models.Usuario;
import co.edu.iudigital.app.repositories.IUsuarioRepository;
import co.edu.iudigital.app.services.ifaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    private final IUsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> getAll() {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return usuarios.stream().map(u ->
                UsuarioDTO.builder()
                        .id(u.getId())
                        .nombre(u.getNombre())
                        .apellido(u.getApellido())
                        .fechaNacimiento(u.getFechaNacimiento())
                        .enabled(u.getEnabled())
                        .image(u.getImage())
                        .redSocial(u.getRedSocial())
                        .roles(u.getRoles())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioDTO getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
