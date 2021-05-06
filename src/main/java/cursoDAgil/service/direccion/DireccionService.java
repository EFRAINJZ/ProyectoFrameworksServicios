package cursoDAgil.service.direccion;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Direccion;
public interface DireccionService {
	List<Direccion> obtenerDirecciones();
	Integer nuevaDireccionCliente(Direccion direccion);
	Direccion obtenerDireccionPorId(Map<String, Integer> mapDireccion);
	Direccion borrarDireccionPorId(Map<String, Integer> mapDireccion);
	Integer modificarDireccionPorId(Direccion direccion);
}
