
package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Cargo;
import pe.com.autoservicio.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService{
    @Autowired
    private CargoRepository respositorio;
    @Override
    public List<Cargo> findAll() {
        return respositorio.findAll();    
    }

    @Override
    public List<Cargo> findAllCustom() {
        return respositorio.findAllCustom();
    }

    @Override
    public Optional<Cargo> findById(Long id) {
        return respositorio.findById(id);
    }

    @Override
    public Cargo add(Cargo d) {
        return respositorio.save(d);    
    }

    @Override
    public Cargo update(Cargo d) {
        Cargo objcargo=respositorio.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objcargo);
        return respositorio.save(objcargo);      }

    @Override
    public Cargo delete(Cargo d) {
        Cargo objcargo=respositorio.getById(d.getCodigo());
        objcargo.setEstado(false);
        return respositorio.save(objcargo);      }
    
}
