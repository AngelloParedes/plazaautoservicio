
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
@Entity(name="Proveedor")
@Table(name="proveedor")
public class Proveedor {
    @Id
    @Column(name="idproveedor")
    private long codigo;
    @Column(name="nom_proveedor")
    private String nombre;
    @Column(name="direccion")
    private String p_venta;
    @Column(name="telefono")
    private String p_compra;
    @Column(name="estado")
    private boolean estado;
}
