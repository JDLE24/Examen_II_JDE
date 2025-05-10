package Examen2.demo.service;

import Examen2.demo.model.Prestamo;
import Examen2.demo.repository.ordenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private ordenRepository repository;

    public List<Productos> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Productos Productos) {
        repository.save(prestamo);
    }

    public Productos obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}