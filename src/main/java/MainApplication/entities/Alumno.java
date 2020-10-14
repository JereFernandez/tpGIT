package MainApplication.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

import javax.persistence.*;


@Entity
@Table(name = "persona")
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@Builder
@Audited
public class Alumno extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private int email;
    @Column(name="foto")
    private byte foto;

    
}