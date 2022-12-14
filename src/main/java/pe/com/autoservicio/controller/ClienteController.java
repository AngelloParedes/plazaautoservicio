
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
import pe.com.autoservicio.entity.Cliente;
import pe.com.autoservicio.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteservice;
    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteservice.findAll();
    }
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return clienteservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return clienteservice.findById(id);
    }
    @PostMapping
    public Cliente add(@RequestBody Cliente c){
        return clienteservice.add(c);
    }
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id, @RequestBody Cliente c){
    c.setCodigo(id);
        return clienteservice.add(c);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
    Cliente objcliente = new Cliente();
    objcliente.setEstado(false);
    return clienteservice.delete(Cliente.builder().codigo(id).build());
    }
}
