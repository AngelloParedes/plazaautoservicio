
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo,Long>{
    @Query("select a from Cargo a where a.estado=1")
    List<Cargo> findAllCustom();
    
}
