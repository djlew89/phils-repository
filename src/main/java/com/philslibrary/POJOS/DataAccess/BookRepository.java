package com.philslibrary.POJOS.DataAccess;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

import com.philslibrary.Book;

public interface BookRepository extends CrudRepository <Book, Integer> {
    Iterable<Book> getAllByBookId(Integer id);
}
