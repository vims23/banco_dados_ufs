package com.example.demo.Model;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cartao {

    @Id
    @NotNull
    String id_cartao;
    float saldo;
    String id_usuario;
    
}






