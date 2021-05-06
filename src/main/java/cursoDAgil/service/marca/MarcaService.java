package cursoDAgil.service.marca;
import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Marca;
public interface MarcaService {
		List<Marca> obtenerMarcas();
		Integer nuevaMarca(Marca marca);
		Marca obtenerMarcaPorId(Map<String, Integer> mapMarca);
		Integer actualizarMarca(Marca marca);
		Integer borrarMarca(Map<String,Integer> mapMarca);

}
