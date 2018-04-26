package com.mayweather.dao;

import com.mayweather.entity.Author;

/**
 * Interface extends methods from GenericDAO for working with data base and entities
 * Interface would be implemented by DAO classes that will work with Author entity
 */
public interface AuthorDAO extends GenericDAO<Author, Long> {
}
