
package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autor")
public class AutorController {
    private final List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String exibirAutor(Model model) {
        model.addAttribute("autores", autores);
        return "livros/autor";
    }

    @PostMapping("/criar")
    public String criar(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autor";
    }
}
