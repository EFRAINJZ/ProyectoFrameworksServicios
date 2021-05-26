package cursoDAgil.service.cliente;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.dao.cliente.ClienteDao;

@Named
public class ClienteServiceImpl implements ClienteService, Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1395305282711791357L;
	@Inject
	ClienteDao clienteDao;

	@Override
	public List<Cliente> listarTodosClientes() {
		return clienteDao.listarTodosClientes();
	}
	public Integer agregarCliente(Cliente cliente) {
		System.out.println("Servicios");
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getApellido());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getDireccion().getIdDireccion());
		return clienteDao.agregarCliente(cliente);
	}
	public Cliente obtenerClientePorId(Map<String,Integer>mapCliente) {
		return clienteDao.obtenerClientePorId(mapCliente);
	}
	public Integer actualizaCliente(Cliente cliente) {
		return clienteDao.actualizaCliente(cliente);
	}
	public Integer eliminarCliente(Map<String,Integer>mapCliente) {
		return clienteDao.eliminarCliente(mapCliente);
	}


}
