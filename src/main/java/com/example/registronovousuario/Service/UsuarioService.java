package com.example.registronovousuario.Service;

import com.example.registronovousuario.Entity.Usuario;
import com.example.registronovousuario.Repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository = new UsuarioRepository();

    public Usuario cadastrarUsuario(Usuario usuario) {
        for (Usuario u : usuarioRepository.listaUsuarios()) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return null;
            }

        }
        return usuarioRepository.salvaUsuario(usuario);
    }

    public Usuario salvarUsuario(Usuario usuario) {
        usuarioRepository.salvaUsuario(usuario);

        return usuario;
    }

    public Usuario lerUsuario(int id) {
        usuarioRepository.lerUsuario(id);
        return null;
    }

    public List<Usuario> listaUsuarios() {
        return usuarioRepository.listaUsuarios();
    }

    public Usuario atualizarUsuario(Usuario usuario, int id) {
        Usuario usuario1 = usuarioRepository.lerUsuario(id);
        if (usuario1 == null) {
            return null;

        } else
            usuario.setId(id);
            usuarioRepository.deletarUsuario(usuario1);
            usuarioRepository.salvaUsuario(usuario);
            return usuario;
    }
}
