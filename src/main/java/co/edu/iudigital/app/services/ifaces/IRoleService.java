package co.edu.iudigital.app.services.ifaces;


import co.edu.iudigital.app.dtos.RoleDTO;

import java.util.List;

public interface IRoleService {
    List<RoleDTO> getAll(); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    RoleDTO save(RoleDTO role);

    RoleDTO  getById(Long id);
}
