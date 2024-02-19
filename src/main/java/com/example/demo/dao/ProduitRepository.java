
package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Produit;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @Query("select p from Produit p where p.designation like :x")
    Page<Produit> chercher(@Param("x") String mc, Pageable pageable);
}
