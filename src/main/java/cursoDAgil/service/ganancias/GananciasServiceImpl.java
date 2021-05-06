package cursoDAgil.service.ganancias;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Ganancias;
import cursoDAgil.dao.ganancias.GananciasDao;

@Named
public class GananciasServiceImpl implements GananciasService{
	@Inject
	GananciasDao gananciasDao;
	
	@Override
	public List<Ganancias> obtenerGanancias() {
		return gananciasDao.obtenerGanancias();
	}
	@Override
	public List<Ganancias> obtenerGananciasPorFecha(Map<String, String> mapDireccion){
		return gananciasDao.obtenerGananciasPorFecha(mapDireccion);
	}
	@Override
	public Integer nuevaGanancia(Ganancias ganancias){
		return gananciasDao.nuevaGanancia(ganancias);
	}
}
