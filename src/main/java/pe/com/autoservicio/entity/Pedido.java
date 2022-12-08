
package pe.com.autoservicio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Pedido")
@Table(name="pedidos")
public class Pedido {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idpedido")
    private long codigo;
    @Column(name="fecha")
    private String nombre;
    @Column(name="totalv")
    private double total;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idcliente", nullable=false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="idempleado", nullable=false)
    private Empleado empleado;
}
