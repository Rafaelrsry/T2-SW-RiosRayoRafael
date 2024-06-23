package pe.edu.cibertec.T2_SW_RiosRayoRafael.model.bd;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idespecialidad;

    @Column(name = "titulo")
    private String titulo;



    @Column(name = "funcion")
    private String funcion;

    @Column(name = "fechgraduacion")
    private Date fechgraduacion;

    @OneToOne
    @JoinColumn(name = "idmedico")
    private Medico medico;

}
