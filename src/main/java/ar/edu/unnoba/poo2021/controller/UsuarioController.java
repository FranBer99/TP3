package ar.edu.unnoba.poo2021.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unnoba.poo2021.model.Usuario;
import ar.edu.unnoba.poo2021.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService userService;

    //"http://localhost:8080/usuarios/register"
    @GetMapping("/register")
    public String userNew(Model model){
        model.addAttribute("usuario",new Usuario());
        return "usuarios/register";
    }

    //"http://localhost:8080/usuarios
    @PostMapping
    public String create(@ModelAttribute Usuario user){
        userService.create(user);
        return "redirect:/usuarios";
    }
    
    /*
    @GetMapping("/delete/{id}")
    public String userDelete(@PathVariable("id") Long userId){
        userService.delete(userId);
        return "redirect:/users";
    }
    
    @GetMapping
    public String getUsers(Model model){
        model.addAttribute("usuarios",userService.getUsuarios());
        return "users/index";
    }
    */
}

