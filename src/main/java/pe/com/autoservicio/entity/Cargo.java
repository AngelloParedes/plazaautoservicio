
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
@Entity(name="Cargo")
@Table(name="cargo")
public class Cargo {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcargo")
    private long codigo;
    @Column(name="nom_cargo")
    private String nombre;
    @Column(name="sueldo")
    private double sueldo;
    @Column(name="estado")
    private boolean estado;
}
