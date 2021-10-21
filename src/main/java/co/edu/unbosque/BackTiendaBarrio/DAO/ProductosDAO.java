package co.edu.unbosque.BackTiendaBarrio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.BackTiendaBarrio.model.Productos;

public interface ProductosDAO extends JpaRepository <Productos, Long> {

}
