package cursoDAgil.service.cliente;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.service.cliente.ClienteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ClienteServiceImplTest {
	@Inject
	ClienteService clienteService;
	
	@Test
	public void pruebaConsultarTodo(){
		int reg;
		System.out.println("\nTest para consultar los clientes");
		try {
			List<Cliente> lista= clienteService.listarTodosClientes();
			reg = lista.size();
			assertEquals(lista.size(),reg);
			System.out.println("\nRegistros en la tabla: " + reg);

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println("error: "+ex);
		}
	}

	@Test
	public void pruebaAgregarUnCliente() {
		Cliente cliente = new Cliente();
		System.out.println("\nTest nuevo registro");
		try {
			cliente.setNombre("Mariela");
			cliente.setApellido("Lopez Lopez");
			cliente.setEmail("MarielaLL@gmail.com");
			cliente.setSexo("Femenino");
			cliente.setIddireccion(1);
			clienteService.agregarCliente(cliente);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	@Test
	public void pruebaConsultarClientePorId() {
		System.out.println("\ntest consultar cliente por id");
		Cliente cliente = new Cliente();
		Map<String, Integer> mapCliente = new HashMap<>();
		mapCliente.put("id", 3);
		try {
			cliente = clienteService.obtenerClientePorId(mapCliente);
			assertNotNull(cliente);
			System.out.println("id:" + cliente.getId());
			System.out.println("nombre:" + cliente.getNombre());
			System.out.println("apellido:" + cliente.getApellido());
			System.out.println("sexo:" + cliente.getSexo());
			System.out.println("email:" + cliente.getEmail());
			System.out.println("idDireccion:" + cliente.getIddireccion());


		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	@Test
	public void pruebaEliminarCliente() {
		Map<String, Integer> mapCliente = new HashMap<>();
		mapCliente.put("id", 1);
		System.out.println("\nTest Eliminar cliente");
		try {
			clienteService.eliminarCliente(mapCliente);
			
		}catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
	
	@Test
	public void pruebaActualizaCliente() {
		Cliente cliente = new Cliente();
		System.out.println("\nTest actualizar registro");
		try {
			cliente.setId(2);
			cliente.setNombre("Mariela");
			cliente.setApellido("Lopez Lopez");
			cliente.setEmail("MarielaLL@gmail.com");
			cliente.setSexo("Femenino");
			cliente.setIddireccion(1);
			clienteService.actualizaCliente(cliente);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}




}
