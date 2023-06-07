package com.example.registronovousuario.Repository;

import com.example.registronovousuario.Entity.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UsuarioRepository {
    List<Usuario> listaUsuarios=new ArrayList<>();
    Usuario usuario=new Usuario("Moacir","moacirheck@hotmail.com","123456",12);

    public UsuarioRepository() {
        listaUsuarios.add(usuario);
    }

    public Usuario salvaUsuario (Usuario usuario) {

            listaUsuarios.add(usuario);
            return usuario;


    }
    public Usuario lerUsuario(@PathVariable int id){
        for (Usuario n : listaUsuarios) {
            if (n.getId() == id) {
                return n;
            }
        }
        return new Usuario();
    }
    public List<Usuario> listaUsuarios(){
        return listaUsuarios;
    }
    public Usuario deletarUsuario(Usuario usuario){
      listaUsuarios.remove(usuario);
      return usuario;
    }

}
