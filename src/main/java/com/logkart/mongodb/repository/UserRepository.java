package com.logkart.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.logkart.mongodb.dbmodel.DbCustomer;

@Repository
public interface UserRepository extends MongoRepository<DbCustomer, String>{
}
