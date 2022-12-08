
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
import pe.com.autoservicio.entity.Cargo;
import pe.com.autoservicio.service.CargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    private CargoService service;
    
    @GetMapping
    public List<Cargo> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Cargo> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Cargo> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Cargo add(@RequestBody Cargo c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public Cargo update(@PathVariable long id, @RequestBody Cargo c){
    c.setCodigo(id);
        return service.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Cargo delete(@PathVariable long id){
    Cargo objcategoria = new Cargo();
    objcategoria.setEstado(false);
    return service.delete(Cargo.builder().codigo(id).build());
    }
}
