package cursoDAgil.service.producto;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Productos;

public interface ProductoService {
	
	List<Productos> obtenerProductos();
	Integer agregarProductos(Productos productos);
	Productos obtenerProductosPorId(Map<String, Integer> mapProductos);
	Integer eliminarProductoPorId(Map<String, Integer> mapProductos);
	Integer modificarProducto(Productos productos);
}
