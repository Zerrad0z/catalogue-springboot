
package com.example.demo.dao;

import com.example.demo.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categorie, Long>{
    
}
