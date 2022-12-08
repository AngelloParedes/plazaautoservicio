
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
import pe.com.autoservicio.entity.Empleado;
import pe.com.autoservicio.service.EmpleadoService;



@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService service;
    
    @GetMapping
    public List<Empleado> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Empleado> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Empleado add(@RequestBody Empleado c){
        return service.add(c);
    }
    @PutMapping("/{id}")
    public Empleado update(@PathVariable long id, @RequestBody Empleado c){
    c.setCodigo(id);
        return service.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable long id){
    Empleado objcategoria = new Empleado();
    objcategoria.setEstado(false);
    return service.delete(Empleado.builder().codigo(id).build());
    }
}
