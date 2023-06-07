package com.example.registronovousuario.Controller;

import com.example.registronovousuario.Entity.Usuario;
import com.example.registronovousuario.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class Cadastro {
    @Autowired
    UsuarioService usuarioService;



    @PostMapping("/usuario/salvar")
    public Usuario salvaUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping("/usuario/{id}")
    public Usuario buscaAutorId(@PathVariable int id) {
        return usuarioService.lerUsuario(id);
    }
    @GetMapping("usuarios")
    public List<Usuario> buscarUsuarios(){
        return usuarioService.listaUsuarios();
    }
    @PutMapping("/atualizar/{id}")
    public  Usuario atualizarUsuario(@PathVariable int id,@RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(usuario, id);
    }

}
