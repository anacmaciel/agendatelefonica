package com.catalisa.agendatelefonica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "agenda_telefonica")
public class ContatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indice;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 11, unique = true)
    private String numeroDeTelefone;
}
