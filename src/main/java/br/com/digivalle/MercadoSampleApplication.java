package br.com.digivalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.digivalle.domain.Usuario;
import br.com.digivalle.repository.UsuarioRepository;

@SpringBootApplication
public class MercadoSampleApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MercadoSampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u = new Usuario(null, "nome@mail.com", "asdfas");
		
		repository.save(u);
		
	}

}
