
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Producto;
import pe.com.autoservicio.entity.Proveedor;
import pe.com.autoservicio.repository.ProductoRepository;
import pe.com.autoservicio.repository.ProveedorRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoRepository respositorioproducto;
    
    @Override
    public List<Producto> findAll() {
        return respositorioproducto.findAll();    
    }

    @Override
    public List<Producto> findAllCustom() {
        return respositorioproducto.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return respositorioproducto.findById(id);
    }

    @Override
    public Producto add(Producto d) {
        return respositorioproducto.save(d);    
    }

    @Override
    public Producto update(Producto d) {
Producto objproducto=respositorioproducto.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objproducto);
        return respositorioproducto.save(objproducto);    }

    @Override
    public Producto delete(Producto d) {
        Producto objproducto=respositorioproducto.getById(d.getCodigo());
        objproducto.setEstado(false);
        return respositorioproducto.save(objproducto);    }
    
}
