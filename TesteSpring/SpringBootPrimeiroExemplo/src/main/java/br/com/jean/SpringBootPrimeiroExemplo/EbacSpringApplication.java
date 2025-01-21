package br.com.jean.SpringBootPrimeiroExemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import br.com.jean.SpringBootPrimeiroExemplo.domain.model.Cliente;
import br.com.jean.SpringBootPrimeiroExemplo.domain.repository.IClienteRepository;

@SpringBootApplication
@EnableJpaRepositories("br.com.jean.SpringBootPrimeiroExemplo.domain.repository")
@EntityScan("br.com.jean.SpringBootPrimeiroExemplo.domain.model")
public class EbacSpringApplication implements CommandLineRunner{
private static final Logger log = LoggerFactory.getLogger(EbacSpringApplication.class);
	
	@Autowired
	private IClienteRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EbacSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}
	
	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("RJ")
				.cpf(12312312310L)
				.email("Bruno@teste.com")
				.end("End")
				.estado("RJ")
				.nome("Bruno")
				.numero(9)
				.telefone(61999999999L)
				.build();
	}

}
	

