
package pe.com.autoservicio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Cliente")
@Table(name="clientes")
public class Cliente {
     private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcliente")
    private long codigo;
    @Column(name="nom_cliente")
    private String nombre;
    @Column(name="ape_cliente")
    private String apellido;
    @Column(name="dni")
    private String dni;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
    @Column(name="estado")
    private boolean estado;
}
