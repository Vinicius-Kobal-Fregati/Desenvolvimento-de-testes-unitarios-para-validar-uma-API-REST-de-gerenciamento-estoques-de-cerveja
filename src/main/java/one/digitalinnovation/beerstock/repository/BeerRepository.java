package one.digitalinnovation.beerstock.repository;

import one.digitalinnovation.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> { // Aqui implementamos o padrão arquitetural, aqui nossa classe tem a responsabilidade de conversar com nosso banco de dados.

    Optional<Beer> findByName(String name); // Faz a criação, exclusão, atualização e leitura dos dados. Com o optional podemos fazer várias operações de validação.
}
