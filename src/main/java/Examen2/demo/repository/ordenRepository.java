package Examen2.demo.repository;

import Examen2.demo.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ordenRepository extends JpaRepository<Productos, Long> {
}