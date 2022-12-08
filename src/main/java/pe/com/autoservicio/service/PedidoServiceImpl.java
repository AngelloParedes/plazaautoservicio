
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Empleado;
import pe.com.autoservicio.entity.Pedido;
import pe.com.autoservicio.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{
    @Autowired
    private PedidoRepository respositorio;
    
    @Override
    public List<Pedido> findAll() {
        return respositorio.findAll();    
    }

    @Override
    public List<Pedido> findAllCustom() {
        return respositorio.findAllCustom();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return respositorio.findById(id);
    }

    @Override
    public Pedido add(Pedido d) {
        return respositorio.save(d);    
    }

    @Override
    public Pedido update(Pedido d) {
        Pedido objempleado=respositorio.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objempleado);
        return respositorio.save(objempleado);    }

    @Override
    public Pedido delete(Pedido d) {
        Pedido objempleado=respositorio.getById(d.getCodigo());
        objempleado.setEstado(false);
        return respositorio.save(objempleado);     }
    
}
