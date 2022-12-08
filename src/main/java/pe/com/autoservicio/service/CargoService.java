
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Cargo;

public interface CargoService {
    //funcion para mostrar todos los datos
    List<Cargo> findAll();
    //funcion para mostrar los distrito habilitados
    List<Cargo> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Cargo> findById(Long id);
    //funcion para registrar
    Cargo add(Cargo d);
    //funcion para actualizar
    Cargo update(Cargo d);
    //funcion para eliminar
    Cargo delete(Cargo d);
}
