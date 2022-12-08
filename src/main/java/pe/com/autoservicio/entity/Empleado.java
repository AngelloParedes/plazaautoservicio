
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
@Entity(name="Empleado")
@Table(name="empleado")
public class Empleado {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idempleado")
    private long codigo;
    @Column(name="nom_empleado")
    private String nombre;
    @Column(name="ape_empleado")
    private String apellido;
    @Column(name="usuario")
    private String usuario;
    @Column(name="contraseña")
    private String contrasena;
    @Column(name="dni")
    private String dni;
    @Column(name="fecha_nacimiento")
    private String nacimiento;
    @Column(name="fecha_contrato")
    private String contrato;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
    @Column(name="estado")
    private boolean estado;    
    @ManyToOne
    @JoinColumn(name="idcargo", nullable=false)
    private Cargo cargo;
}
