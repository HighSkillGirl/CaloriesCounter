package high.skill.girl.project.calories_counter.repository;

import high.skill.girl.project.calories_counter.entity.ProductEntity;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@JdbcRepository(dialect = Dialect.H2)
public interface ProductsRepository extends CrudRepository<ProductEntity, Integer> {

    List<ProductEntity> findByNameContainsIgnoreCase(String name);

    Page<ProductEntity> findAll(Pageable page);
}
