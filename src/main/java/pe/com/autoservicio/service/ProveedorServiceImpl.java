
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Categoria;
import pe.com.autoservicio.entity.Proveedor;
import pe.com.autoservicio.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {
    @Autowired
    private ProveedorRepository respositorioproveedor;
    
    @Override
    public List<Proveedor> findAll() {
        return respositorioproveedor.findAll();    
    }

    @Override
    public List<Proveedor> findAllCustom() {
        return respositorioproveedor.findAllCustom();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return respositorioproveedor.findById(id);
    }

    @Override
    public Proveedor add(Proveedor d) {
        return respositorioproveedor.save(d);    
    }

    @Override
    public Proveedor update(Proveedor d) {
        Proveedor objproveedor=respositorioproveedor.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objproveedor);
        return respositorioproveedor.save(objproveedor);     }

    @Override
    public Proveedor delete(Proveedor d) {
        Proveedor objproveedor=respositorioproveedor.getById(d.getCodigo());
        objproveedor.setEstado(false);
        return respositorioproveedor.save(objproveedor);    }
    
}
