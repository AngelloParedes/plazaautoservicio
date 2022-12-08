
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
@Entity(name="Categoria")
@Table(name="categorias")
public class Categoria {
     private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcategoria")
    private long codigo;
    @Column(name="nom_categoria")
    private String nombre;
    @Column(name="estado")
    private boolean estado;
}
