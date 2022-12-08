
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long>{
    @Query("select a from Empleado a where a.estado=1")
    List<Empleado> findAllCustom();
    
}
