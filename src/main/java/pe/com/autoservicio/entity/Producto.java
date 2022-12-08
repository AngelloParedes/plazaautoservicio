
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
@Entity(name="Producto")
@Table(name="producto")
public class Producto {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idproducto")
    private long codigo;
    @Column(name="nom_producto")
    private String nombre;
    @Column(name="precio_venta")
    private double p_venta;
    @Column(name="precio_compra")
    private double p_compra;
    @Column(name="stock")
    private int stock;
    @Column(name="estado")
    private boolean estado;    
    @ManyToOne
    @JoinColumn(name="idcategoria", nullable=false)
    private Categoria distrito;
    @ManyToOne
    @JoinColumn(name="idproveedor", nullable=false)
    private Proveedor proveedor;
}
