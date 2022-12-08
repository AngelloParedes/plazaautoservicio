
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Categoria;
import pe.com.autoservicio.entity.Cliente;
import pe.com.autoservicio.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository respositoriocliente;
    
    @Override
    public List<Cliente> findAll() {
        return respositoriocliente.findAll();    
    }

    @Override
    public List<Cliente> findAllCustom() {
        return respositoriocliente.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return respositoriocliente.findById(id);
    }

    @Override
    public Cliente add(Cliente d) {
        return respositoriocliente.save(d);    
    }

    @Override
    public Cliente update(Cliente d) {
        Cliente objcliente=respositoriocliente.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objcliente);
        return respositoriocliente.save(objcliente);     }

    @Override
    public Cliente delete(Cliente d) {
        Cliente objcliente=respositoriocliente.getById(d.getCodigo());
        objcliente.setEstado(false);
        return respositoriocliente.save(objcliente);    }
    
}
