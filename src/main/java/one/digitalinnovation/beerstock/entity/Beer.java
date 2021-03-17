package one.digitalinnovation.beerstock.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data // Essa notação gera getters, setters, e mais alguns métodos, como hash code.
@Entity // Essa é a única entidade do nosso projeto
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // O nome da cerveja tem que ser único e não pode ser nulo.
    private String name;

    @Column(nullable = false)
    private String brand; // Aqui temos a marca da cerveja, podemos ter várias e repetidas.

    @Column(nullable = false)
    private int max; // Aqui é o número máximo que podemos ter dessa cerveja no nosso estoque.

    @Column(nullable = false)
    private int quantity; // Aqui representa a quantidade atual que temos dessa cerveja no nosso estoque.

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type; // A representação do tipo da nossa cerveja,


}
