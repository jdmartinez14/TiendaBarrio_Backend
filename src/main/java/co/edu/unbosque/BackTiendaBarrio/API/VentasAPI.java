package co.edu.unbosque.BackTiendaBarrio.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.unbosque.BackTiendaBarrio.DAO.VentasDAO;
import co.edu.unbosque.BackTiendaBarrio.model.Ventas;

@RestController
@RequestMapping ("ventas")
public class VentasAPI {
	
	@Autowired
	private VentasDAO ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Ventas ventas){
		ventasDAO.save(ventas);
	}
	
}
