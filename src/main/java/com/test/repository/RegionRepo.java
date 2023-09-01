package com.test.repository;

import com.test.models.REGION;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface RegionRepo extends MongoRepository<REGION,String> {
}
