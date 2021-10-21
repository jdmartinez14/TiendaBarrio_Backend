package co.edu.unbosque.BackTiendaBarrio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.BackTiendaBarrio.model.Ventas;

public interface VentasDAO extends JpaRepository <Ventas, Long>{

}
