
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra,Long>{
    @Query("select a from Empleado a where a.estado=1")
    List<Compra> findAllCustom();
    
}
