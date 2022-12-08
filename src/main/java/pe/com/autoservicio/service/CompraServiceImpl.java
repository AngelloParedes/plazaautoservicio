
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Cargo;
import pe.com.autoservicio.entity.Compra;
import pe.com.autoservicio.repository.CompraRepository;

@Service
public class CompraServiceImpl implements CompraService{
    @Autowired
    private CompraRepository respositorio;
    @Override
    public List<Compra> findAll() {
        return respositorio.findAll();    
    }

    @Override
    public List<Compra> findAllCustom() {
        return respositorio.findAllCustom();
    }

    @Override
    public Optional<Compra> findById(Long id) {
        return respositorio.findById(id);
    }

    @Override
    public Compra add(Compra d) {
        return respositorio.save(d);    
    }

    @Override
    public Compra update(Compra d) {
        Compra objcompra=respositorio.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objcompra);
        return respositorio.save(objcompra);    
    }

    @Override
    public Compra delete(Compra d) {
        Compra objcompra=respositorio.getById(d.getCodigo());
        objcompra.setEstado(false);
        return respositorio.save(objcompra);    
    }
    
}
