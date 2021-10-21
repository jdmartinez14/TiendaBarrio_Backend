package co.edu.unbosque.BackTiendaBarrio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.BackTiendaBarrio.model.Clientes;

public interface ClientesDAO extends JpaRepository <Clientes, Long>{

}
