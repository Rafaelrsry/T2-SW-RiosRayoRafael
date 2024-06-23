package pe.edu.cibertec.T2_SW_RiosRayoRafael.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.T2_SW_RiosRayoRafael.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer>{

}
