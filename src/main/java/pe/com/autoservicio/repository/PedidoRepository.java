
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido,Long>{
    @Query("select a from Pedido a where a.estado=1")
    List<Pedido> findAllCustom();
    
}
