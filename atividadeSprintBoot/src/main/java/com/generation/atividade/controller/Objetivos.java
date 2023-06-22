package com.generation.atividade.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
@GetMapping
    public List<String> objetivos() {
        return Arrays.asList( 
        		"B-MYSQL - 2 Creating relational Databases with MySQL",
        	    "SSM-OM Open Mentorship Session (2° Sessão de Mentoria)",
        	    "DB-MYSQL - 3 Introduction to SQL",
        	    "SSM-OM Open Session Well-Being (2°Sessão de Bem-Estar)",
        	    "SA-RP4 Role Play 4 - Prioritizing and urgent task",
        	    "DB-MYSQL-4 Advanced SQL - Joining Table",
        	    "SA-PI-T2 Task 2: Prototipando o Banco de dados",
        	    "SA-SUD3 Stayind up to Date-Drill 3",
        	    "WEB-JAVA 1 Introduction to Web Development using Java and Spring Boot",
        	    "BSM-CH3 The Big Picture",
        	    "C-TB8 Guess the Fact",
        	    "WEB-JAVA 2 Dependencies Injection using Spring Framework",
        	    "EE-CV (R1) Introduction to CV and Workshop (CANVAS) SESSÃO 1 - ASSINC",
        	    "EE-CV (R1) Introduction to CV and Workshop (CANVAS) SESSÃO 1 - SINC",
        	    "EE-R1 - Introduction to CV and Workshop (CANVAS - assincrono) - Session 3",
        	    "RR-PC1 Peer Coaching Protocol",
        	    "RR-SC Weekly Scorecard Review Protocol");
    }
}

