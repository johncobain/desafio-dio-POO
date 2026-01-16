package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Conteudo curso1 = new Curso("Java Basics", "Introdução à Java", 2.0);
    Conteudo curso2 = new Curso("Javascript Esentials", "Conceitos básicos Javascript", 3.5);

    System.out.println(curso1);
    System.out.println(curso2);

    System.out.println();

    Conteudo mentoria = new Mentoria("Mentoria Java", "Mentoria Java", LocalDate.now());

    System.out.println(mentoria);
  }
}
