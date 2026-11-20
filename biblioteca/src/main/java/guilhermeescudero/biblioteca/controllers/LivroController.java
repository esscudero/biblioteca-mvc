package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();

    @GetMapping("/inicio")
    public String inicio(){
        return "livros/inicio";
    }

    @GetMapping
    public String exibirLivros(Model model){

        model.addAttribute("livros", livros);

        return "livros/inicio";
    }


    @PostMapping("/criar")
    public String criarLivro(@ModelAttribute Livro livro, Model model){
        livros.add(livro);
        return "redirect:/livros";
    }

    @DeleteMapping("/excluir/{indice}")
        public String excluir(@PathVariable int indice){
        if (indice >= 0 && indice < livros.size()){
            livros.remove(indice);
        }
        return "redirect:/livros";
    }

}
