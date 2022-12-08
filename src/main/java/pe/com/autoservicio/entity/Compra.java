
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
@Entity(name="Compra")
@Table(name="compras")
public class Compra {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcompras")
    private long codigo;
    @Column(name="fecha_compra")
    private String nombre;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idempleado", nullable=false)
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name="idproveedor", nullable=false)
    private Proveedor proveedor;
}
