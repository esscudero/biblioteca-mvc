package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimo")
public class EmprestimoController {
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    @GetMapping
    public String exibirEmprestimos(Model model){
        model.addAttribute("emprestimos", emprestimos);
        return "livros/emprestimo";
    }

    @PostMapping("/criar")
    public String criar(@ModelAttribute Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return "redirect:/emprestimo";
    }
}
