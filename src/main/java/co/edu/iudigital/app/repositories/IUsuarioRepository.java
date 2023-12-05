package co.edu.iudigital.app.repositories;

import co.edu.iudigital.app.models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository
        extends CrudRepository<Usuario, Long> {
    // select * from usuarios where username='dasdasdad';
    //@Query("SELECT u FROM Usuario u WHERE u.username=?1")
    Usuario findByUsername(String username);// usando Spring Data JPA
}
