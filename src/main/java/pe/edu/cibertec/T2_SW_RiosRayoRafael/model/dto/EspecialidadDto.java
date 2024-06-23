package pe.edu.cibertec.T2_SW_RiosRayoRafael.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EspecialidadDto implements DtoEntity{
    private Integer idEspecialidad;
    private String titulo;
    private String funcion;
    private Date fechagraduacion;
    private Integer idmedico;
}
