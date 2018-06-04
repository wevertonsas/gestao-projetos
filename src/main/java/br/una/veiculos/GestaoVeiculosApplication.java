package br.una.veiculos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.una.veiculos.model.Veiculo;
import br.una.veiculos.repository.VeiculoRepository;

@SpringBootApplication
public class GestaoVeiculosApplication implements CommandLineRunner {

	@Autowired
	private VeiculoRepository veiculoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(GestaoVeiculosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Veiculo vei1 = new Veiculo(null, "HPG-4545", "HONDA", "CITY", "2017");
		Veiculo vei2 = new Veiculo(null, "LLG-1234", "FIAT", "Uno", "2011");
		Veiculo vei3 = new Veiculo(null, "AOP-7812", "Volkswagen", "Fusca", "2015");
		
		veiculoRepo.save(vei1);
		veiculoRepo.save(vei2);
		veiculoRepo.save(vei3);
		veiculoRepo.saveAll(Arrays.asList(vei1, vei2, vei3));
		
	}
	
	
}
