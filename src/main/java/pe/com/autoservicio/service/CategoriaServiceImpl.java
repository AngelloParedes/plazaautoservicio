package pe.com.autoservicio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.autoservicio.entity.Categoria;
import pe.com.autoservicio.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository respositorioapoderado;
    @Override
    public List<Categoria> findAll() {
        return respositorioapoderado.findAll();    
    }

    @Override
    public List<Categoria> findAllCustom() {
        return respositorioapoderado.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return respositorioapoderado.findById(id);
    }

    @Override
    public Categoria add(Categoria d) {
        return respositorioapoderado.save(d);    
    }

    @Override
    public Categoria update(Categoria d) {
        Categoria objcategoria=respositorioapoderado.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objcategoria);
        return respositorioapoderado.save(objcategoria);    }

    @Override
    public Categoria delete(Categoria d) {
        Categoria objcategoria=respositorioapoderado.getById(d.getCodigo());
        objcategoria.setEstado(false);
        return respositorioapoderado.save(objcategoria);    }
    
}
