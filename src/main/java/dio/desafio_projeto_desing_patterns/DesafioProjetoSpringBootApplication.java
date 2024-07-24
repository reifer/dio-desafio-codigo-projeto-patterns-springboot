package dio.desafio_projeto_desing_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetoSpringBootApplication.class, args);
	}

}