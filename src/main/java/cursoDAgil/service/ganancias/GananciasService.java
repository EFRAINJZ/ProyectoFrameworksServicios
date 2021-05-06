package cursoDAgil.service.ganancias;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Ganancias;

public interface GananciasService {
	List<Ganancias> obtenerGanancias();
	List<Ganancias> obtenerGananciasPorFecha(Map<String, String> mapDireccion);
	Integer nuevaGanancia(Ganancias ganancias);
}
