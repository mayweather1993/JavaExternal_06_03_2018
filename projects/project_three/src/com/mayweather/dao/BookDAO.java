package com.mayweather.dao;

import com.mayweather.entity.Book;


/**
 * Interface extends methods from GenericDAO for working with data base and entities
 * Interface would be implemented by DAO classes that will work with Book entity
 */
public interface BookDAO extends GenericDAO<Book, Long> {
}
