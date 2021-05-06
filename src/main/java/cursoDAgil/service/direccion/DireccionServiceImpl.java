package cursoDAgil.service.direccion;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.dao.direccion.DireccionDao;

@Named
public class DireccionServiceImpl implements DireccionService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9028559280232977367L;
	
	@Inject
	DireccionDao direccionDao;

	@Override
	public List<Direccion> obtenerDirecciones() {
		return direccionDao.obtenerDirecciones();
	}

	@Override
	public Integer nuevaDireccionCliente(Direccion direccion) {
		// TODO Auto-generated method stub
		return direccionDao.nuevaDireccionCliente(direccion);
	}

	@Override
	public Direccion obtenerDireccionPorId(Map<String, Integer> mapDireccion) {
		// TODO Auto-generated method stub;
		return direccionDao.obtenerDireccionPorId(mapDireccion);
	}

	@Override
	public Direccion borrarDireccionPorId(Map<String, Integer> mapDireccion) {
		// TODO Auto-generated method stub
		return direccionDao.borrarDireccionPorId(mapDireccion);
	}

	@Override
	public Integer modificarDireccionPorId(Direccion direccion) {
		// TODO Auto-generated method stub
		return direccionDao.modificarDireccionPorId(direccion);
	}

}
