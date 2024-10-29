package br.edu.fatec.pg.Aplicacao.JPA.models;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "nome_completo")
  private String nome;
  @Column(unique = true)
  private String cpf;

  public Aluno(String nome, String cpf){

  }
}
