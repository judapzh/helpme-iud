package co.edu.iudigital.app.utils;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.dtos.UsuarioDTORequest;
import co.edu.iudigital.app.models.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class MapperUsuario {

    public UsuarioDTO toUsuarioDTO(Usuario usuario) {
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .username(usuario.getUsername())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .fechaNacimiento(usuario.getFechaNacimiento())
                .image(usuario.getImage())
                .redSocial(usuario.getRedSocial())
                .roles(usuario.getRoles())
                .build();
    }

    public Usuario toUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
        usuario.setImage(usuarioDTO.getImage());
        usuario.setRedSocial(usuarioDTO.getRedSocial());
        usuario.setRoles(usuarioDTO.getRoles());
        return usuario;
    }

    public Usuario toUsuario(UsuarioDTORequest usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
        usuario.setImage(usuarioDTO.getImage());
        usuario.setRedSocial(usuarioDTO.getRedSocial());

        return usuario;
    }

    public List<UsuarioDTO> toUsuariosDTO(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(usuario -> toUsuarioDTO(usuario))
                .collect(Collectors.toList());
    }

    public List<Usuario> toUsuarios(List<UsuarioDTO> usuariosDTO) {
        return usuariosDTO.stream()
                .map(usuarioDTO -> toUsuario(usuarioDTO))
                .collect(Collectors.toList());
    }
}

