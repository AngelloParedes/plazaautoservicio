
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Producto;

public interface ProductoService {
    //funcion para mostrar todos los datos
    List<Producto> findAll();
    //funcion para mostrar los distrito habilitados
    List<Producto> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Producto> findById(Long id);
    //funcion para registrar
    Producto add(Producto d);
    //funcion para actualizar
    Producto update(Producto d);
    //funcion para eliminar
    Producto delete(Producto d);
}
