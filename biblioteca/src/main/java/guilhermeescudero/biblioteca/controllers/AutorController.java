
package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @GetMapping
    public String exibirAutor(Model model) {
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasileiro");
        autor.setDataNascimento("21/06/1839");

        model.addAttribute("autor", autor);

        return "livros/autor";
    }
}
