package cursoDAgil.service.marca;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Marca;
import cursoDAgil.dao.Marca.MarcaDao;
@Named
public class MarcaServiceImpl implements MarcaService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4128854419361761512L;
	@Inject
	MarcaDao marcaDao;
	@Override
	public List<Marca> obtenerMarcas() {
		// TODO Auto-generated method stub
		return marcaDao.obtenerMarcas();
		
	}

	@Override
	public Integer nuevaMarca(Marca marca) {
		// TODO Auto-generated method stub
		return marcaDao.nuevaMarca(marca);
	}

	@Override
	public Marca obtenerMarcaPorId(Map<String, Integer> mapMarca) {
		// TODO Auto-generated method stub
		return marcaDao.obtenerMarcaPorId(mapMarca);
	}

	@Override
	public Integer actualizarMarca(Marca marca) {
		// TODO Auto-generated method stub
		return marcaDao.actualizarMarca(marca);
	}

	@Override
	public Integer borrarMarca(Map<String, Integer> mapMarca) {
		// TODO Auto-generated method stub
		return marcaDao.borrarMarca(mapMarca);
	}

}
