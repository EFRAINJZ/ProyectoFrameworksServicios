package cursoDAgil.service.detallesVenta;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.DetallesVenta;
import cursoDAgil.dao.detallesVenta.DetallesVentaDao;

@Named
public class DetallesVentaServiceImpl implements DetallesVentaService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8647989143530626259L;

	@Inject
	DetallesVentaDao detallesVentaService;
	@Override
	public Integer nuevoDetallesVenta(DetallesVenta detallesVenta) {
		// TODO Auto-generated method stub
		return detallesVentaService.nuevoDetallesVenta(detallesVenta);
	}

	@Override
	public List<DetallesVenta> obtenerDetallesVenta(Map<String, Integer> mapDetallesVenta) {
		// TODO Auto-generated method stub
		return detallesVentaService.obtenerDetallesVenta(mapDetallesVenta);
	}

	@Override
	public List<DetallesVenta> ListarTodosLosDetalles() {
		// TODO Auto-generated method stub
		return detallesVentaService.ListarTodosLosDetalles();
	}

}
