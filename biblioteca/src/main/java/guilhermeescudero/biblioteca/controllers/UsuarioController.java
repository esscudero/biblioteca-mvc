package guilhermeescudero.biblioteca.controllers;

import guilhermeescudero.biblioteca.models.Usuario;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    private final List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public String usuario(Model model){
        model.addAttribute("usuarios", usuarios);
        return "livros/usuario";
    }

    @PostMapping("/criar")
    public String criar(@ModelAttribute Usuario usuario) {
        usuarios.add(usuario);
        return "redirect:/usuario";
    }
}
