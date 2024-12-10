package com.sparta.jpaquiz.repository;

import com.sparta.jpaquiz.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
