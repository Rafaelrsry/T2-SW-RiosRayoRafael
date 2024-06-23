package pe.edu.cibertec.T2_SW_RiosRayoRafael.model.bd;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmedico;

    @Column(name = "nommedico")
    private String nommedico;



    @Column(name = "apeMedico")
    private String apeMedico;

    @Column(name = "fechnacmedico")
    private Date fechnacmedico;
}
