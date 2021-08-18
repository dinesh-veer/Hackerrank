package com.javacodegeeks.examples.repository;

import org.springframework.data.repository.CrudRepository;

import com.javacodegeeks.examples.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
