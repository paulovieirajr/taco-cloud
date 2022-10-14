package br.dev.paulovieira.tacocloud.repository;

import br.dev.paulovieira.tacocloud.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}