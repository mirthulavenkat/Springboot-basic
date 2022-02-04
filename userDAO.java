package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.userdetails;

public interface userDao extends CrudRepository<userdetails, Integer>{

}

//this is mainly used for importing crudrepository to connect with spring
