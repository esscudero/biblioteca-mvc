package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    private final List<Categoria> categorias = new ArrayList<>();

    @GetMapping
    public String exibirCategoria(Model model) {
        model.addAttribute("categorias", categorias);
        return "livros/categoria";
    }

    @PostMapping("/criar")
    public String criar(@ModelAttribute Categoria categoria) {
        categorias.add(categoria);
        return "redirect:/categoria";
    }
}
