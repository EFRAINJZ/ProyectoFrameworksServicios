package cursoDAgil.service.cliente;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Cliente;
public interface ClienteService {
	List<Cliente> listarTodosClientes();
	Integer agregarCliente(Cliente cliente);
	Cliente obtenerClientePorId(Map<String,Integer>mapCliente);
	Integer actualizaCliente(Cliente cliente);
	Integer eliminarCliente(Map<String,Integer>mapCliente);

}

//Prueba pa Efraín 
