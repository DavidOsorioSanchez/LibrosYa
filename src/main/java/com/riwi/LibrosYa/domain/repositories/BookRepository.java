package com.riwi.LibrosYa.domain.repositories;

import com.riwi.LibrosYa.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
