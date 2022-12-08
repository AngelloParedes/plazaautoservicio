
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
import pe.com.autoservicio.entity.Producto;
import pe.com.autoservicio.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoservice;
    
    @GetMapping
    public List<Producto> findAll(){
        return productoservice.findAll();
    }
    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return productoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        return productoservice.findById(id);
    }
    @PostMapping
    public Producto add(@RequestBody Producto c){
        return productoservice.add(c);
    }
    @PutMapping("/{id}")
    public Producto update(@PathVariable long id, @RequestBody Producto c){
    c.setCodigo(id);
        return productoservice.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
    Producto objproducto = new Producto();
    objproducto.setEstado(false);
    return productoservice.delete(Producto.builder().codigo(id).build());
    }
}
