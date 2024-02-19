package com.example.demo;

import com.example.demo.dao.CategoryRepository;
import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatalogueApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CatalogueApplication.class, args);
        ProduitRepository produitDao = ctx.getBean(ProduitRepository.class);
        CategoryRepository categoryRepository = ctx.getBean(CategoryRepository.class);
        
  
    }
}
