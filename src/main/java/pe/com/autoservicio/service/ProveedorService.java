
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Proveedor;

public interface ProveedorService {
    //funcion para mostrar todos los datos
    List<Proveedor> findAll();
    //funcion para mostrar los distrito habilitados
    List<Proveedor> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Proveedor> findById(Long id);
    //funcion para registrar
    Proveedor add(Proveedor d);
    //funcion para actualizar
    Proveedor update(Proveedor d);
    //funcion para eliminar
    Proveedor delete(Proveedor d);
}
