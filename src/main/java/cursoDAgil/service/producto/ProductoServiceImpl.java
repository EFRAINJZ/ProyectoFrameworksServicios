package cursoDAgil.service.producto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Productos;
import cursoDAgil.dao.Productos.ProductosDao;

@Named
public class ProductoServiceImpl implements ProductoService, Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5630555962721170553L;
	@Inject
	ProductosDao productosDao;
	
	@Override
	public List<Productos> obtenerProductos() {
		return productosDao.obtenerProductos();
	}

	@Override
	public Integer agregarProductos(Productos productos) {
		return productosDao.agregarProductos(productos);
	}

	@Override
	public Productos obtenerProductosPorId(Map<String, Integer> mapProductos) {
		// TODO Auto-generated method stub
		return productosDao.obtenerProductosPorId(mapProductos);
	}

	@Override
	public Integer eliminarProductoPorId(Map<String, Integer> mapProductos) {
		// TODO Auto-generated method stub
		return productosDao.eliminarProductoPorId(mapProductos);
	}

	@Override
	public Integer modificarProducto(Productos productos) {
		// TODO Auto-generated method stub
		return productosDao.modificarProducto(productos);
	}
	
}
