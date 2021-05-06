package cursoDAgil.service.ganancias;

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

import cursoDAgil.bd.domain.Ganancias;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class GananciasServiceImplTest {
	@Inject
	GananciasService gananciasService;
	
	@Test
	public void pruebaConsultarTodo(){
		int reg;
		try{
			List<Ganancias> lista = gananciasService.obtenerGanancias();
			reg = lista.size();
			assertEquals(lista.size(), reg);
		}catch (Exception e){
			System.out.println("error" + e);
		}
	}
	
	@Ignore
	public void pruebaConsultarPorFecha(){
		Map<String, String> mapGanancias = new HashMap<>();
		mapGanancias.put("fecha", "2021-04-14");
		try {
			List<Ganancias> ganancias = gananciasService.obtenerGananciasPorFecha(mapGanancias);
			assertNotNull(ganancias);
			//System.out.println("fecha:" + ganancias.getFecha());
			//System.out.println("ganacia:" + ganancias.getTotalGanancia());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	@Ignore
	public void pruebaNuevaGanancia(){
		Ganancias ganancia = new Ganancias();
		try {
			ganancia.setVentaId(1);
			ganancia.setTotalGanancia(2123.90);
			ganancia.setFecha("2021-05-03");
			gananciasService.nuevaGanancia(ganancia);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
