package high.skill.girl.project.calories_counter.repository.impl;

import high.skill.girl.project.calories_counter.entity.ProductEntity;
import high.skill.girl.project.calories_counter.repository.SearchRepository;
import io.micronaut.data.connection.annotation.Connectable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class SearchRepositoryImpl implements SearchRepository {

    @Inject
    private DataSource dataSource;

    @Override
    @Connectable
    public ProductEntity searchByNameWords(String[] nameWords) {
        StringBuilder sql = new StringBuilder();
        sql.append("""
                  SELECT *
                  FROM products
                  WHERE 1=1
                  """);

        List<String> params = new ArrayList<>(nameWords.length);

        for (String s : nameWords) {
            sql.append("""
                       AND LOWER(name) LIKE ?
                      """);
            params.add("%" + s.toLowerCase() + "%");
        }

        try (Connection con = dataSource.getConnection()) {

            try (PreparedStatement pstmt = con.prepareStatement(sql.toString())) {

                for (int i = 0; i < params.size(); i++) {
                    pstmt.setString(i + 1, params.get(i));
                }

                try (ResultSet resultSet = pstmt.executeQuery()) {

                    List<ProductEntity> resultList = new ArrayList<>();
                    while (resultSet.next()) {
                        resultList.add(new ProductEntity(resultSet.getInt("id"),
                                                         resultSet.getBigDecimal("proteins"),
                                                         resultSet.getBigDecimal("fats"),
                                                         resultSet.getBigDecimal("carbohydrates"),
                                                         resultSet.getBigDecimal("calories"),
                                                         resultSet.getString("name")));
                    }
                    return resultList.getFirst();

                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
