package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @GetMapping
    public String exibirCategoria(Model model) {
        Categoria categoria = new Categoria();
        categoria.setNome("Romance");
        categoria.setDescricao("Livros de romance");
        categoria.setCodigo("CAT001");

        model.addAttribute("categoria", categoria);

        return "livros/categoria";
    }
}
