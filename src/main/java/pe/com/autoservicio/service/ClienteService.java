
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Cliente;

public interface ClienteService {
    //funcion para mostrar todos los datos
    List<Cliente> findAll();
    //funcion para mostrar los distrito habilitados
    List<Cliente> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Cliente> findById(Long id);
    //funcion para registrar
    Cliente add(Cliente d);
    //funcion para actualizar
    Cliente update(Cliente d);
    //funcion para eliminar
    Cliente delete(Cliente d);
}
