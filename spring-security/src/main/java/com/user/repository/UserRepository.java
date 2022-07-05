package com.user.repository;

import java.util.List;

public interface UserRepository {

import.org.springframework.data.jpa.Repository.jpaRepository;

public interfaceUserRepository Extends jpa repository <User,Integer>;

List<User>FindByUserName(String Username);
}
