
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    @Query("select a from Cliente a where a.estado=1")
    List<Cliente> findAllCustom();
    
}
