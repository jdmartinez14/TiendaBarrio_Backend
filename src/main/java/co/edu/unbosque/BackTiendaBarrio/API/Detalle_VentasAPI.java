package co.edu.unbosque.BackTiendaBarrio.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.unbosque.BackTiendaBarrio.DAO.Detalle_VentasDAO;
import co.edu.unbosque.BackTiendaBarrio.model.Detalle_Ventas;

@RestController
@RequestMapping ("detalle_ventas")
public class Detalle_VentasAPI {
	
	@Autowired
	private Detalle_VentasDAO detalle_ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Detalle_Ventas detalle_ventas){
		detalle_ventasDAO.save(detalle_ventas);
	}

}
