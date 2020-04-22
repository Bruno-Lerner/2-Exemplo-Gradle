package lerner.bruno.exemplogradle;

import lerner.bruno.exemplogradle.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 14/04/2020 11:05
 */
@SpringBootApplication
public class ExemplogradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplogradleApplication.class, args);

		System.out.println("Segundo exemplo SpringBOOT com Gradle!");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Bruno");
		System.out.println(pessoa);
	}

}
