package cursoDAgil.service.producto;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Productos;
import cursoDAgil.service.producto.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ProductoServiceImplTest {
	@Inject
	ProductoService productoService;
	
	@Ignore
	public void pruebaConsultarTodo(){
		try {
			List<Productos> lista = productoService.obtenerProductos();
			assertEquals(lista.size(),lista.size());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error: "+e);
		}
	}
	
	@Ignore
	public void nuevoRegistro() {
		Productos productos = new Productos();
		System.out.println("Test nuevo registro");
		try {
			productos.setNombre("Prueba producto");
			productos.setPrecio(22);
			productos.setPrecioVta(33);
			productos.setCantidad(274);
			productos.setMarcaId(2);
			productoService.agregarProductos(productos);
		} catch(Exception e) {
			System.out.println("error: "+e);
		}
	}
	
	@Test
	public void consultarProductosPorId(){
		Productos productos = new Productos();
		System.out.println("Test Buscar Producto por Id");
		Map<String, Integer> mapDireccion = new HashMap<>();
		mapDireccion.put("idProducto",3);
		try {			
			productos = productoService.obtenerProductosPorId(mapDireccion);
			assertNotNull(productos);
			System.out.println("id:" + productos.getIdProducto());
			System.out.println("Nombre:" + productos.getNombre());
			System.out.println("Nombre marca:" + productos.getMarcas().getNombreMarca());
		} catch(Exception e) {
			System.out.println("error: "+e);
		}
	}
	
	@Ignore
	public void eliminarProducto() {
		Productos productos = new Productos();
		System.out.println("Test eliminar un producto por id");
		Map<String, Integer> mapDireccion = new HashMap<>();
		mapDireccion.put("idProducto",14);
		try {
			productoService.eliminarProductoPorId(mapDireccion);
			assertNotNull(productos);
		} catch(Exception e) {
			System.out.println("error: "+e);
		}
	}
	
	@Ignore
	public void modificarProducto() {
		Productos productos = new Productos();
		System.out.println("Test modificar productos");
		try {
			productos.setIdProducto(1);
			productos.setNombre("Procesador modificado");
			productos.setPrecio(4000);
			productos.setPrecioVta(5678);
			productos.setCantidad(123);
			productoService.modificarProducto(productos);
		} catch(Exception e) {
			System.out.println("error: "+e);
		}
	}
}
