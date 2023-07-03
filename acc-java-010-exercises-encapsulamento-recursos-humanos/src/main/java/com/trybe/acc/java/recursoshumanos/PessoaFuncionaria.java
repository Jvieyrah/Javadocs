package com.trybe.acc.java.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {
  private String nomeCompleto;
  private String cpf;
  private String endereco;
  private double salario;

  /**
   * An abstract class that represents an algorithm. Parameters.
   */
  public PessoaFuncionaria(String nome, String document, String end, double sal) {
    this.nomeCompleto = nome;
    this.cpf = document;
    this.endereco = end;
    this.salario = sal;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public String getEndereco() {
    return endereco;
  }

  public double getSalario() {
    return salario;
  }

  public String getCpf() {
    return cpf;
  }

}
