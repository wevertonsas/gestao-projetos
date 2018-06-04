package br.una.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.una.veiculos.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	
}
