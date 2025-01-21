package br.com.jean.SpringBootPrimeiroExemplo.domain.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jean.SpringBootPrimeiroExemplo.domain.model.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{
}