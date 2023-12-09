package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.dtos.UsuarioDTORequest;
import co.edu.iudigital.app.exception.CustomException;
import co.edu.iudigital.app.models.Usuario;
import co.edu.iudigital.app.repositories.IUsuarioRepository;
import co.edu.iudigital.app.services.ifaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
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
        // You can implement this method if needed
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();

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

    public UsuarioDTO findById(Long id) throws CustomException {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);

        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            return UsuarioDTO.builder()
                    .id(usuario.getId())
                    .nombre(usuario.getNombre())
                    .apellido(usuario.getApellido())
                    .fechaNacimiento(usuario.getFechaNacimiento())
                    .enabled(usuario.getEnabled())
                    .image(usuario.getImage())
                    .redSocial(usuario.getRedSocial())
                    .roles(usuario.getRoles())
                    .build();
        } else {
            throw new CustomException("Usuario not found with id: " + id);
        }
    }


    @Override
    public UsuarioDTO save(UsuarioDTORequest usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setFechaNacimiento(usuarioDTO.getFechaNacimiento());

        usuario.setImage(usuarioDTO.getImage());
        usuario.setRedSocial(usuarioDTO.getRedSocial());


        Usuario savedUsuario = usuarioRepository.save(usuario);

        return UsuarioDTO.builder()
                .id(savedUsuario.getId())
                .nombre(savedUsuario.getNombre())
                .apellido(savedUsuario.getApellido())
                .fechaNacimiento(savedUsuario.getFechaNacimiento())
                .enabled(savedUsuario.getEnabled())
                .image(savedUsuario.getImage())
                .redSocial(savedUsuario.getRedSocial())
                .roles(savedUsuario.getRoles())
                .build();
    }

    @Override
    public UsuarioDTO getById(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);

        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            return UsuarioDTO.builder()
                    .id(usuario.getId())
                    .nombre(usuario.getNombre())
                    .apellido(usuario.getApellido())
                    .fechaNacimiento(usuario.getFechaNacimiento())
                    .enabled(usuario.getEnabled())
                    .image(usuario.getImage())
                    .redSocial(usuario.getRedSocial())
                    .roles(usuario.getRoles())
                    .build();
        } else {
            //restriciones de usuario no definidas aun
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}

