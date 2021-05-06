package cursoDAgil.service.venta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.bd.domain.Venta;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentaServiceImplTest {
   @Inject
   VentaService ventaService;
   
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
   
   /*
    *
    
    */
}
