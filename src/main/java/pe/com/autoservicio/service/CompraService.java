
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Compra;

public interface CompraService {
    //funcion para mostrar todos los datos
    List<Compra> findAll();
    //funcion para mostrar los distrito habilitados
    List<Compra> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Compra> findById(Long id);
    //funcion para registrar
    Compra add(Compra d);
    //funcion para actualizar
    Compra update(Compra d);
    //funcion para eliminar
    Compra delete(Compra d);
}
