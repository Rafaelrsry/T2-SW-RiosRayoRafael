package pe.edu.cibertec.T2_SW_RiosRayoRafael.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedicoDto implements DtoEntity {

    private Integer idMedico;
    private String nommedico;
    private String apemedico;
    private Date fechanac;
}
