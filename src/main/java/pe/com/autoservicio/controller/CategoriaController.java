
package pe.com.autoservicio.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.autoservicio.entity.Categoria;
import pe.com.autoservicio.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaservice;
    
    @GetMapping
    public List<Categoria> findAll(){
        return categoriaservice.findAll();
    }
    @GetMapping("/custom")
    public List<Categoria> findAllCustom(){
        return categoriaservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return categoriaservice.findById(id);
    }
    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return categoriaservice.add(c);
    }
    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id, @RequestBody Categoria c){
    c.setCodigo(id);
        return categoriaservice.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
    Categoria objcategoria = new Categoria();
    objcategoria.setEstado(false);
    return categoriaservice.delete(Categoria.builder().codigo(id).build());
    }
}
