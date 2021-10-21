package co.edu.unbosque.BackTiendaBarrio.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.unbosque.BackTiendaBarrio.DAO.ClientesDAO;
import co.edu.unbosque.BackTiendaBarrio.model.Clientes;

@RestController
@RequestMapping ("clientes")
public class ClientesAPI {
	
	@Autowired
	private ClientesDAO clientesDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Clientes clientes){
		clientesDAO.save(clientes);
	}
	
	@GetMapping ("/listar")
	public List<Clientes> listar(){
		return clientesDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable("id") Long id) {
		clientesDAO.deleteById(id);		
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Clientes clientes){
		clientesDAO.save(clientes);
	}

}
