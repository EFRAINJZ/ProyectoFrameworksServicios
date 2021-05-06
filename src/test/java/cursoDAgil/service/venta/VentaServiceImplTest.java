package cursoDAgil.service.venta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.bd.domain.Productos;
import cursoDAgil.bd.domain.Venta;
import cursoDAgil.service.producto.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentaServiceImplTest {
   @Inject
   VentaService ventaService;
   @Inject
   ProductoService productoService;
   @Ignore
	public void pruebaObtenerVentas(){
		int reg;
		System.out.println("Test obtener todas las ventas");

		
		try{
			List<Venta> lista=ventaService.obtenerVentas();
			
			reg = lista.size();
			System.out.println("\nRegistros en la tabla ventas: " + reg);
			assertEquals(lista.size(), reg);
			for(Venta vtas:lista){
				System.out.println("IdVenta: "+vtas.getIdVenta());
				System.out.println("Cliente: "+vtas.getCliente().getNombre());
				System.out.println("IdVenta: "+vtas.getFecha());
				System.out.println("IdVenta: "+vtas.getTotalVenta());
				System.out.println();


				
			}
			
		}catch(Exception e){
			System.out.println("Error en test "+e);
		}
	} 
   @Ignore
  	public void pruebaObtenerVentaPorId(){
  	
  		Venta venta=new Venta();
  		int idVenta=9;
  		System.out.println("Test obtener ventaa por id");
  		try{
  			 venta=ventaService.obtenerVentasPorId(idVenta);
  			assertNotNull(venta);
  			
  			System.out.println("IdVenta: "+venta.getIdVenta());
  			System.out.println("Cliente: "+venta.getCliente().getNombre()
  					+" "+venta.getCliente().getApellido());
  			Direccion direccion=venta.getCliente().getDireccion();
  			System.out.println("Calle : "+direccion.getCalle());
  			System.out.println("Colonia : "+direccion.getColonia());
  			System.out.println("Ciudad : "+direccion.getCiudad());
  			System.out.println("Estado : "+direccion.getEstado());
  			System.out.println("Pais : "+direccion.getPais());
  			System.out.println("Codigo postal : "+direccion.getCodigoPostal());
  			System.out.println("Numero : "+direccion.getNumero());
  		}catch(Exception e){
  			System.out.println("Error "+e);
  		}
  	}
   @Test
	public void pruebaObtenerVentaConProductosPorId(){
		
		Venta venta=new Venta();
		int idVenta=1;
		
		System.out.println("Test obtener ventas con productos por id");
		try{
			venta=ventaService.obtenerVentasConProductosPorId(idVenta);
			assertNotNull(venta);
			System.out.println("IdVenta: "+venta.getIdVenta());
			System.out.println("Cliente: "+venta.getCliente().getNombre()
					+" "+venta.getCliente().getApellido());
			Direccion direccion=venta.getCliente().getDireccion();
			System.out.println("Calle : "+direccion.getCalle());
			System.out.println("Colonia : "+direccion.getColonia());
			System.out.println("Ciudad : "+direccion.getCiudad());
			System.out.println("Estado : "+direccion.getEstado());
			System.out.println("Pais : "+direccion.getPais());
			System.out.println("Codigo postal : "+direccion.getCodigoPostal());
			System.out.println("Numero : "+direccion.getNumero());
			
			 System.out.println();
			List<Productos> productos=venta.getProductos();
			if(productos==null){
				System.out.println("No se encontraron productos");

			}else
			for(Productos prod:productos){
			   System.out.println("Nombre producto: "+prod.getNombre());
			   System.out.println("Marca del producto: "+prod.getMarcas().getNombreMarca());
			   System.out.println("Precio de venta: "+prod.getPrecioVta());
			   System.out.println("Cantidad: "+prod.getCantidad());
			   System.out.println();
			}
			System.out.println("Id Venta:"+venta.getIdVenta());
			
			
		}catch(Exception e){
			System.out.println("Error "+e);
		}
	}
	
   
   /*
    *
    
	
	@Test
	public void pruebaNuevaVenta(){
		Venta nuevaVenta = new Venta();
		List<Productos> carrito = new ArrayList<Productos>();
		Cliente cliente = new Cliente();
		Map<String, Integer> mapCliente = new HashMap<>();
		Double totalVenta=0.0;
		System.out.println("Prueba nueva venta");
		try {
			
			mapCliente.put("id", 3);
			cliente = clienteService.obtenerClientePorId(mapCliente);	
			
			nuevaVenta.setCliente(cliente);
			nuevaVenta.setClienteId(cliente.getId());
			
			Map<String, Integer> mapProducto = new HashMap<>();
			
			for(int i=7; i<=8; i++){
				mapProducto.put("idProducto", i);
				
				Productos producto = new Productos();
				producto=productoService.obtenerProductosPorId(mapProducto);
				assertNotNull(producto);
				producto.setCantidad(i*2);
				totalVenta+=producto.getCantidad()*producto.getPrecioVta();
				carrito.add(producto);
			}
			nuevaVenta.setTotalVenta(totalVenta);
			nuevaVenta.setProductos(carrito);
			nuevaVenta.setFecha("2021-04-21");
			ventaService.nuevaVenta(nuevaVenta);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		System.out.println("Terminado");
		
	}

    */
}
