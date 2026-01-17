package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Conteudo curso1 = new Curso("Java Basics", "Introdução à Java", 2.0);
    Conteudo curso2 = new Curso("Java Esentials", "Conceitos básicos Java 8+", 3.5);


    Conteudo mentoria = new Mentoria("Mentoria Java", "Mentoria Java", LocalDate.now());

//    System.out.println(curso1);
//    System.out.println(curso2);
//
//    System.out.println();
//    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp(
        "BootCamp Java Developer",
        "Ciclo Basico Do Java");

    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev john = new Dev("John");
    john.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos de " + john.getNome() + ": " + john.getConteudosInscritos());
    john.progredir();
    john.progredir();
    john.progredir();
    System.out.println();
    System.out.println("Conteudos Inscritos de " + john.getNome() + ": " + john.getConteudosInscritos());
    System.out.println("Conteudos Concluidos de " + john.getNome() + ": " + john.getConteudosConcluidos());
    System.out.println("XP: " + john.calcularXp());

    System.out.println("---------------------------------------------------------------------------------------");

    Dev mary = new Dev("Mary");
    mary.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos de " + mary.getNome() + ": " + mary.getConteudosInscritos());
    mary.progredir();
    mary.progredir();
    System.out.println();
    System.out.println("Conteudos Inscritos de " + mary.getNome() + ": " + mary.getConteudosInscritos());
    System.out.println("Conteudos Concluidos de " + mary.getNome() + ": " + mary.getConteudosConcluidos());
    System.out.println("XP: " + mary.calcularXp());
  }
}
