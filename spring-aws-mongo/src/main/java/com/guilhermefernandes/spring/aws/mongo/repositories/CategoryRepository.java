package com.guilhermefernandes.spring.aws.mongo.repositories;

import com.guilhermefernandes.spring.aws.mongo.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
