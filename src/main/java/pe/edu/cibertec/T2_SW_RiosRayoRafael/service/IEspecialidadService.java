package pe.edu.cibertec.T2_SW_RiosRayoRafael.service;

import pe.edu.cibertec.T2_SW_RiosRayoRafael.model.bd.Especialidad;

import java.util.List;
import java.util.Optional;

public interface IEspecialidadService {
    List<Especialidad> listarEspecialidad();
    Especialidad guardarEspecialidad(Especialidad especialidad);
    Optional<Especialidad> obtenerEspecialidadxId(Integer id);
}
