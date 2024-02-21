package com.guilhermefernandes.spring.aws.mongo.domain.product;

public record ProductDTO (String title, String description, String ownerId, Integer price, String categoryId){

}
