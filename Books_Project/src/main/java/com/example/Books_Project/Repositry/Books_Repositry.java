package com.example.Books_Project.Repositry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Books_Project.Entity.Book;

@Repository
public interface Books_Repositry extends JpaRepository<Book, Integer>
{

}
