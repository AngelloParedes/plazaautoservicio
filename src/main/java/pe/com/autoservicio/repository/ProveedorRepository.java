
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Proveedor;


public interface ProveedorRepository extends JpaRepository<Proveedor,Long>{
    @Query("select a from Proveedor a where a.estado=1")
    List<Proveedor> findAllCustom();
    
}
