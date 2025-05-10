package Examen2.demo.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Examen2.demo.model.Productos;
import com.Examen2.demo.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Productos")
public class HomeController {
    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttrubute("orden", servicio.listarTodos());
        return "produtos/listar";
    }

    @GetMapping("/nuevo")
    public String agregarorden(Model model) {
        model.addAttrubute("listaProductos", servicio.listarTodos());
        return "productos/editar";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Productos productos) {
        servicio.guardar(Productos);
        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("Productos", servicio.obtenerPorId(id));
        return "/Productos/editar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@Pathvariable Long id, Model model) {
        model.
        return "/Productos/eliminar";
    }


}