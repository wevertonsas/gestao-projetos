package br.una.veiculos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.una.veiculos.model.Veiculo;
import br.una.veiculos.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repositorio;
	
	public Veiculo buscarPorId(Long id) {
		Optional<Veiculo> obj = repositorio.findById(id);
		return obj.orElse(null);
	}
}
