package high.skill.girl.project.calories_counter.repository;

import high.skill.girl.project.calories_counter.entity.ProductEntity;

public interface SearchRepository {

    ProductEntity searchByNameWords(String name);

}
