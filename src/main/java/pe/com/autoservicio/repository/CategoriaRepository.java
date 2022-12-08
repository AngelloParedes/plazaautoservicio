
package pe.com.autoservicio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.autoservicio.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
    @Query("select a from Categoria a where a.estado=1")
    List<Categoria> findAllCustom();
    
}
