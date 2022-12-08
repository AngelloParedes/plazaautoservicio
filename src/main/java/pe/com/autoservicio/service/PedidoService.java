
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import pe.com.autoservicio.entity.Pedido;

public interface PedidoService {
    //funcion para mostrar todos los datos
    List<Pedido> findAll();
    //funcion para mostrar los distrito habilitados
    List<Pedido> findAllCustom();
    //funcion para buscar un distrito por codigo
    Optional<Pedido> findById(Long id);
    //funcion para registrar
    Pedido add(Pedido d);
    //funcion para actualizar
    Pedido update(Pedido d);
    //funcion para eliminar
    Pedido delete(Pedido d);
}
