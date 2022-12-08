
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Categoria;

public interface CategoriaService {
    //funcion para mostrar todos los datos
    List<Categoria> findAll();
    //funcion para mostrar los distrito habilitados
    List<Categoria> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Categoria> findById(Long id);
    //funcion para registrar
    Categoria add(Categoria d);
    //funcion para actualizar
    Categoria update(Categoria d);
    //funcion para eliminar
    Categoria delete(Categoria d);
}
