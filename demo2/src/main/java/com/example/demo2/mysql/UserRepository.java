package com.example.demo2.mysql;

import org.springframework.data.repository.CrudRepository;

// 这将由Spring自动实现到一个名为userRepository的Bean中
// CRUD指创建、读取、更新、删除

public interface UserRepository extends CrudRepository<User, Integer> {
}
