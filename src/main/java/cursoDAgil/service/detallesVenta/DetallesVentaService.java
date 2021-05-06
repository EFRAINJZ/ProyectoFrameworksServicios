package cursoDAgil.service.detallesVenta;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.DetallesVenta;

public interface DetallesVentaService {
	Integer nuevoDetallesVenta(DetallesVenta detallesVenta);
	List<DetallesVenta> obtenerDetallesVenta(Map<String, Integer> mapDetallesVenta);
	List<DetallesVenta> ListarTodosLosDetalles();
}
