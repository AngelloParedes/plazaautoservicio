
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Empleado;
import pe.com.autoservicio.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoRepository respositorio;

    @Override
    public List<Empleado> findAll() {
        return respositorio.findAll();    
    }

    @Override
    public List<Empleado> findAllCustom() {
        return respositorio.findAllCustom();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return respositorio.findById(id);
    }

    @Override
    public Empleado add(Empleado d) {
        return respositorio.save(d);    
    }

    @Override
    public Empleado update(Empleado d) {
        Empleado objempleado=respositorio.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objempleado);
        return respositorio.save(objempleado);    }

    @Override
    public Empleado delete(Empleado d) {
        Empleado objempleado=respositorio.getById(d.getCodigo());
        objempleado.setEstado(false);
        return respositorio.save(objempleado);    }
    
}
