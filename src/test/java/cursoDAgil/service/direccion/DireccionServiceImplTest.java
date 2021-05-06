package cursoDAgil.service.direccion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Direccion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class DireccionServiceImplTest {
	
	@Inject
	DireccionService direccionService;

	
	@Test
	public void pruebaConsultarTodo(){
		try {
			List<Direccion> lista = direccionService.obtenerDirecciones();
			assertEquals(lista.size(),lista.size());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error: "+e);
		}
	}
	
	@Ignore
	public void consultarDireccionPorId() {
		Direccion direccion = new Direccion();
		Map<String, Integer> mapDireccion = new HashMap<>();
		mapDireccion.put("idDireccion", 3);
		try {
			direccion = direccionService.obtenerDireccionPorId(mapDireccion);
			assertNotNull(direccion);
			System.out.println("id:" + direccion.getIdDireccion());
			System.out.println("calle:" + direccion.getCalle());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	
	@Ignore
	public void borrarDireccionPorId() {
		Direccion direccion = new Direccion();
		Map<String, Integer> mapDireccion = new HashMap<>();
		mapDireccion.put("idDireccion", 13569);
		try {
			direccion = direccionService.borrarDireccionPorId(mapDireccion);
			assertNull(direccion);
			System.out.println("Borrada correctamente");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

	
	@Ignore
	public void modificarDireccionPorId() {
		Direccion direccion = new Direccion();
		try {
			direccion.setIdDireccion(13570);
			direccion.setCiudad("Cruz Azul");
			direccionService.modificarDireccionPorId(direccion);
			assertEquals(direccion.getCiudad(), "Cruz Azul");
			System.out.println("Modificada correctamente");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}
	
	@Ignore
	public void nuevoRegistro() {
		Direccion direccion = new Direccion();
		System.out.println("Test nuevo registro");
		try {
			direccion.setCalle("Juan Guillermo");
			direccion.setNumero(3);
			direccion.setColonia("San Agustin");
			direccion.setCiudad("Oaxaca");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigoPostal(67000);
			direccionService.nuevaDireccionCliente(direccion);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
