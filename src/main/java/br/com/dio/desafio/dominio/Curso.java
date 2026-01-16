package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
  private double cargaHoraria;

  public Curso(String titulo, String descricao, double cargaHoraria) {
    super(titulo, descricao);
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * this.getCargaHoraria();
  }

  public double getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(double cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "titulo='" + this.getTitulo() + '\'' +
        ", descricao='" + this.getDescricao() + '\'' +
        ", cargaHoraria=" + this.getCargaHoraria() +
        '}';
  }
}
