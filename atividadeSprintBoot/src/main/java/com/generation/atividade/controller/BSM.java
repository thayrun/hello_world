package com.generation.atividade.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bsm")
public class BSM {
@GetMapping
public List<String> bsms() {
    return Arrays.asList(
        "Responsabilidade Pessoal",
        "Mentalidade de Crescimento",
        "Orientação ao Futuro",
        "Persistência",
        "Comunicação",
        "Orientação aos Detalhes",
        "Trabalho em Equipe",
        "Proatividade"
    );
}
}
