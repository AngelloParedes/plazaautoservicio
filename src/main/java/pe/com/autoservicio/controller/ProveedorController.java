
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
import pe.com.autoservicio.entity.Proveedor;
import pe.com.autoservicio.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorservice;
    
    @GetMapping
    public List<Proveedor> findAll(){
        return proveedorservice.findAll();
    }
    @GetMapping("/custom")
    public List<Proveedor> findAllCustom(){
        return proveedorservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable Long id){
        return proveedorservice.findById(id);
    }
    @PostMapping
    public Proveedor add(@RequestBody Proveedor c){
        return proveedorservice.add(c);
    }
    @PutMapping("/{id}")
    public Proveedor update(@PathVariable long id, @RequestBody Proveedor c){
    c.setCodigo(id);
        return proveedorservice.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Proveedor delete(@PathVariable long id){
    Proveedor objcategoria = new Proveedor();
    objcategoria.setEstado(false);
    return proveedorservice.delete(Proveedor.builder().codigo(id).build());
    }
}
