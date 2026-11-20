package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @GetMapping
    public String exibirEmprestimos(Model model){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataRetirada("12/11/2026");
        emprestimo.setUsuario("joaozinho");
        emprestimo.setDataDevolvido("aa");

        model.addAttribute("emprestimo", emprestimo);

        return "livros/emprestimo";
    }
}
