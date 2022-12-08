
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Producto;



public interface ProductoRepository extends JpaRepository<Producto,Long>{
    @Query("select a from Producto a where a.estado=1")
    List<Producto> findAllCustom();
    
}
