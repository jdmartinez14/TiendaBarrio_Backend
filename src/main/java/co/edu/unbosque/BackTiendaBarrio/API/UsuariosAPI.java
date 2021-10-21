package co.edu.unbosque.BackTiendaBarrio.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.unbosque.BackTiendaBarrio.DAO.UsuariosDAO;
import co.edu.unbosque.BackTiendaBarrio.model.Usuarios;

@RestController
@RequestMapping ("usuarios")
public class UsuariosAPI {
	
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Usuarios usuarios){
		usuariosDAO.save(usuarios);
	}
	
	@GetMapping ("/listar")
	public List<Usuarios> listar(){
		return usuariosDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable("id") Long id) {
		usuariosDAO.deleteById(id);		
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios){
		usuariosDAO.save(usuarios);
	}

}
