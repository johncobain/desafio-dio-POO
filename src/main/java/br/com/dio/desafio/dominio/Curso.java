package br.com.dio.desafio.dominio;

public class Curso {
  private String titulo;
  private String descricao;
  private double cargaHoraria;

  public Curso(String titulo, String descricao, double cargaHoraria) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public double getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(double cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "titulo='" + titulo + '\'' +
        ", descricao='" + descricao + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';
  }
}
