package pe.edu.cibertec.T2_SW_RiosRayoRafael.service;

import pe.edu.cibertec.T2_SW_RiosRayoRafael.model.bd.Medico;

import java.util.List;
import java.util.Optional;


public interface IMedicoService {

    List<Medico> listarMedicos();

    Medico guardarMedico(Medico medico);

    Optional<Medico> obtenerMedicoxId(Integer id);
}
