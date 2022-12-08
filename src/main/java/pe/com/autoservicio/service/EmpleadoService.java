
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Empleado;


public interface EmpleadoService {
    //funcion para mostrar todos los datos
    List<Empleado> findAll();
    //funcion para mostrar los distrito habilitados
    List<Empleado> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Empleado> findById(Long id);
    //funcion para registrar
    Empleado add(Empleado d);
    //funcion para actualizar
    Empleado update(Empleado d);
    //funcion para eliminar
    Empleado delete(Empleado d);
}
