package cursoDAgil.service.venta;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Venta;
import cursoDAgil.dao.venta.VentaDao;

@Named
public class VentaServiceImpl implements VentaService,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4762839200843710458L;
    @Inject
    VentaDao ventaDao;
    
	@Override
	public Integer nuevaVenta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDao.nuevaVenta(venta);
	}

	@Override
	public List<Venta> obtenerVentas() {
		// TODO Auto-generated method stub
		return ventaDao.obtenerVentas();
	}

	@Override
	public Venta obtenerVentasPorId(Integer idVenta) {
		// TODO Auto-generated method stub
		return ventaDao.obtenerVentasConProductosPorId(idVenta);
	}

	@Override
	public Venta obtenerVentasConProductosPorId(Integer idVenta) {
		// TODO Auto-generated method stub
		return ventaDao.obtenerVentasConProductosPorId(idVenta);
	}
	
}
