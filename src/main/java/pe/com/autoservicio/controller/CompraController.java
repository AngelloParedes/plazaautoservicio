
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
import pe.com.autoservicio.entity.Compra;
import pe.com.autoservicio.service.CompraService;


@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    private CompraService service;
    
    @GetMapping
    public List<Compra> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Compra> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Compra> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Compra add(@RequestBody Compra c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public Compra update(@PathVariable long id, @RequestBody Compra c){
    c.setCodigo(id);
        return service.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Compra delete(@PathVariable long id){
    Compra objcategoria = new Compra();
    objcategoria.setEstado(false);
    return service.delete(Compra.builder().codigo(id).build());
    }
}
