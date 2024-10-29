package br.edu.fatec.pg.Aplicacao.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatec.pg.Aplicacao.JPA.repository.AlunoRepository;

@SpringBootApplication
public class AplicacaoJpaApplication {
@Autowired
  private AlunoRepository repository;

	public static void main(String[] args) {
    @Override
		SpringApplication.run(AplicacaoJpaApplication.class, args);
      public void run(String args) throws Exception {
    Aluno aluno = new Aluno("Ale", "312");
    
  }

	}
}
