package com.example.registronovousuario.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int id;
}
